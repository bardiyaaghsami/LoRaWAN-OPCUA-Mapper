#include <stdio.h>
#include <signal.h>

#include <open62541/server.h>
#include <open62541/server_config_default.h>
#include <open62541/plugin/log_stdout.h>

static volatile UA_Boolean running = true;

static void stopHandler(int sig)
{
    (void)sig;
    printf("STOP SIGNAL RECEIVED\n");
    running = false;
}

int main(void)
{
    printf("STEP1: START\n");

    signal(SIGINT, stopHandler);
    signal(SIGTERM, stopHandler);

    printf("STEP2: SIGNALS OK\n");

    UA_Server *server = UA_Server_new();

    if (!server) {
        printf("ERROR: UA_Server_new() FAILED\n");
        return 1;
    }

    printf("STEP3: SERVER CREATED\n");

    UA_StatusCode cfg =
        UA_ServerConfig_setDefault(
            UA_Server_getConfig(server));

    printf("STEP4: CONFIG RESULT = 0x%08x\n", cfg);

    if (cfg != UA_STATUSCODE_GOOD) {
        printf("ERROR: CONFIG FAILED\n");
        UA_Server_delete(server);
        return 1;
    }

    printf("STEP5: RUNNING SERVER\n");

    UA_StatusCode retval =
        UA_Server_run(server, &running);

    printf("STEP6: SERVER EXITED, RETVAL = 0x%08x\n", retval);

    UA_Server_delete(server);

    return (retval == UA_STATUSCODE_GOOD) ? 0 : 1;
}
