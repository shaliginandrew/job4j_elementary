package ru.job4j.ex;

public class FindEl {

    public static int indexOf(String[] value, String key) throws ElementNotFoundException  {
        int rsl = -1;
        int index = 0;
        for (String k : value) {
            if (k.equals(key)) {
                rsl = index;
            }
            index++;
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("key should be found");
        }
        return rsl;
    }

    public static boolean sent(String value, String[] abuses) throws ElementAbuseException {
        // if contains throw ElementAbuseException
        return true;
    }

    public static void process(String[] values, String key, String[] abuses) {
        try {
            if (indexOf(values, key) != -1) {
                sent(key, abuses);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args)  {
        String[] value = {"andrey", "sergey", "nikolay"};
        try {
            int result = indexOf(value, "nikolay");
            System.out.println(result);
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
