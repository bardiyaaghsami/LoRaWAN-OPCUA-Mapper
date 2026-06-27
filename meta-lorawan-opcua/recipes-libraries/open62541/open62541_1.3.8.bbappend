PACKAGECONFIG:append = " multithreading"

PACKAGECONFIG:remove = " pubsub-eth"

EXTRA_OECMAKE:append = " -DBUILD_SHARED_LIBS=ON"
