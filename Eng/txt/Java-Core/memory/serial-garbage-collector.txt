## Serial Garbage Collector

Serial Garbage Collector was one of the first garbage collectors in HotSpot VM. While this collector is running, the application is suspended and continues to run only after garbage collection stops.

Application memory is divided into three spaces:

- Young generation. Objects are created in this memory location.
- Old generation. Objects that survive the “minor garbage collection” are moved to this memory location.
- Permanent generation. Metadata about objects, Class data sharing (CDS), and a String pool are stored here. The permanent area is divided into two: read-only and read-write. Obviously, in this case, the read-only area is never cleaned by the garbage collector.

The Young generation memory area consists of three areas:
- Eden and two smaller ones
- Survivor spaces - To space and From space.

Most objects are created in the Eden area, with the exception of very large objects that cannot be placed in it and are therefore immediately placed in Old generation. Survivor spaces move objects that have survived at least one garbage collection, but have not yet reached the tenuring threshold to be moved to the Old generation.

When the Young generation is full, a minor collection process is started in this area, as opposed to a collection process carried out over the entire heap (full collection). It happens as follows: at the beginning of work, one of the Survivor spaces - To space, is empty, and the other - From space, contains objects that survived previous assemblies. The garbage collector looks for living objects in Eden and copies them to To space, and then copies living “young” (that is, those that have not yet survived a specified number of garbage collections) objects from From space there. Old objects from From space are moved to Old generation. After easy assembly, From space and To space change roles, the Eden area becomes empty, and the number of objects in the Old generation increases.

If the To space becomes full during the process of copying living objects, then the remaining living objects from Eden and From space that did not have enough space in the To space will be moved to the Old generation, regardless of how many garbage collections they have survived.

Since this algorithm simply copies all living objects from one memory location to another, the garbage collector is called copying. Obviously, for a copying garbage collector to work, the application must always have a free memory area into which live objects will be copied, and such an algorithm can be used for memory areas that are relatively small in relation to the overall memory size of the application. Young generation just satisfies this condition (by default on client machines this area occupies about 10% of the heap (the value may vary depending on the platform)).

However, for garbage collection in Old generation, which occupies most of the total memory, a different algorithm is used.

In Old generation, garbage collection occurs using the mark-sweep-compact algorithm, which consists of three phases. In the Mark phase, the garbage collector marks all living objects, then, in the Sweep phase, all unmarked objects are deleted, and in the Compact phase, all living objects are moved to the beginning of the Old generation, resulting in free memory after cleaning represents a continuous area. The compaction phase is performed to avoid fragmentation and simplify the memory allocation process in the Old generation.

When free memory is a contiguous area, a very fast (about a dozen machine instructions) bump-the-pointer algorithm can be used to allocate memory for the object being created: the address of the beginning of free memory is stored in a special pointer, and when a request to create a new object arrives, the code checks that there is enough space for the new object, and if so, it simply increments the pointer to the size of the object.

The sequential garbage collector is well suited for most applications that use up to 200 megabytes of heap, run on client machines, and do not have strict requirements for the length of garbage collection pauses. At the same time, the stop-the-world model can cause long pauses in the application when using large amounts of memory. In addition, the sequential operating algorithm does not make optimal use of the computer's computing resources, and the sequential garbage collector can become a bottleneck when running the application on multiprocessor machines.