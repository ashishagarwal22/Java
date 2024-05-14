package com.Strings;

// 4th File in Strings Lesson
/*
Refer the **Notes --> String Section** for below script.
 */
public class StringBuilderLesson {
    public static void main(String[] args) {
        String series = "";

        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            series = series + ch;
        }
        System.out.println(series);

        /*
        This is not a good way for string concatenation in loop.
        Every time you concatenate a string, new object is being created (bcz string are immutable)
        with (size+1). That means it takes O(N^2) time complexity.

        That's why we need some object for which on appending or modifying, no new object is created
        and get updated on the already existing object (Like Arrays).

        That's where "StringBuilder" comes into scene.
         */



        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a' + i);
            builder.append(ch);
        }
        System.out.println(builder);
        // This is mutable. So, this is not creating new object. Thus, time complexity is O(n).
        // This also provides many methods convenient to us.

    }
}
