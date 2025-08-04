package org.lld.questions.lrucache;

public class LruCacheDemo {
    public static void run() {
        LruCache lruCache = new LruCache(3);

        lruCache.put(10, 1);
        lruCache.put(1, 1);
        lruCache.put(4, 1);
        lruCache.put(34, 232);

        System.out.println(lruCache.get(34));
        System.out.println(lruCache.get(10)); // null
        lruCache.put("bh", "str");

        System.out.println(lruCache.get("bh"));
        lruCache.remove("bh");
        System.out.println(lruCache.get("bh"));


    }
    public static void main(String[] args) {
        run();
    }
}
