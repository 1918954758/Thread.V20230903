package com.zichen.t1.t12;

/**
 * @Name: Test
 * @Description: interrupted()
 * public static boolean interrupted()
 * Tests whether the current thread has been interrupted. The interrupted status of the thread is cleared by this method. In other words, if this method were to be called twice in succession, the second call would return false (unless the current thread were interrupted again, after the first call had cleared its interrupted status and before the second call had examined it).
 * A thread interruption ignored because a thread was not alive at the time of the interrupt will be reflected by this method returning false.
 *
 * Returns:
 * true if the current thread has been interrupted; false otherwise.
 * See Also:
 * isInterrupted()
 *
 * @User: xdSun
 * @Date: 2023/04/09 14:55:58
 * @Version: 1.0
 **/
public class Run2 {
    public static void main(String[] args) {
        Thread.currentThread().interrupt();
        System.out.println(" 是否停止1？ = " + Thread.interrupted() + " thread = " + Thread.currentThread().getName());
        System.out.println(" 是否停止2？ = " + Thread.interrupted() + " thread = " + Thread.currentThread().getName());
        System.out.println("end!");
    }
}