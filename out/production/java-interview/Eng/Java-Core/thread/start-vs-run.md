## Start vs run

Even though start() calls the run() method internally, it is not the same as just calling run(). If run() is called as a normal method, then it is called on the same thread and no new thread is started, as is the case when you call the start() method.