package com.multithreading.wait;

public class Test {
    public static void main(String[] args) {
        Object obj = new Object();
        T1 t1 = new T1(obj);
        T2 t2 = new T2(obj);

        t1.start();
/*Why sleep is used here?

* Answer:

* Because the program is trying to control the order of execution.

What happens here:

- t1.start() starts thread T1
- then main thread sleeps for 1000 ms
- then t2.start() starts thread T2

Why is that done?

Because in wait/notify programs, we usually want this order:

1. T1 enters synchronized block
2. T1 calls wait()
3. T2 runs later and calls notify()
4. T1 wakes up and continues

If T2 starts too early, then it may call notify() before T1 has reached wait().

That creates a problem called "missed notification" or "lost wake-up".

Example idea:
- T1 is waiting for a resource
- T2 is supposed to send the signal
- If T2 sends the signal before T1 actually starts waiting, then T1 may never wake up

So sleep(1000) is used just to give T1 time to:
- start running
- lock the object
- call wait()
- go into waiting state

Only after that does T2 start and notify.

Important:
- sleep() is only a delay
- it is not the same as wait()
- sleep() does not release the lock
- wait() releases the lock and waits for notify()

So in this code, sleep is used to avoid race conditions and make the timing predictable.

Simple sentence:
"Thread.sleep(1000) is used here to give thread t1 enough time to reach wait() before t2 calls notify()."

Also, after starting both threads:
```java
t1.join();
t2.join();
```
means:
- wait until t1 finishes
- then wait until t2 finishes
- then main thread prints "main thread is running"

This ensures the background threads are finished before main ends.
*/
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        t2.start();

        /*try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }*/
        synchronized (obj) {
            try {
                obj.wait();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
            System.out.println("main thread is running");
        }
    }
}
