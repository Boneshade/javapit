package com.njnx.option;

import java.util.Optional;

/**
 * @author 26586
 */
@SuppressWarnings("all")
public class OptionUsage {
    public static class User {
        private String name;

        public String getName() {
            return name;
        }
    }

    private static void isUserEqualNull() {

        User user = new User();
        if (user != null) {
            System.out.println("user is not null");
        } else {
            System.out.println("user is null");
        }

        Optional<User> optionalUser = Optional.empty();
        if (optionalUser.isPresent()) {
            System.out.println("User is not Null");
        } else {
            System.out.println("User is Null");
        }

        optionalUser.ifPresent(u-> System.out.println("user is not null"));
//        optionalUser.map(u->u.getName()).orElse("user is null");


    }

    private static User anoymos() {
        return new User();
    }


    public static void main(String[] args) {
        //没有意义的方法
//        isUserEqualNull();

        User user = null;
        Optional<User> optionalUser = Optional.ofNullable(user);
//        System.out.println();
        //存在即返回，空则提供默认值
        optionalUser.orElse(new User());
        System.out.println(optionalUser);
        //存在即返回,空则由函数产生
        optionalUser.orElseGet(() -> anoymos());
        System.out.println(optionalUser);
//        optionalUser.orElseThrow(RuntimeException::new);

        //存在才去做相应的处理
//        optionalUser.ifPresent(u -> System.out.println(u.getName()));

        // map 可以对 Optional 中的对象执行某种操作, 且会返回一个 Optional 对象
        optionalUser.map(u -> u.getName()).orElse("anymos");
        System.out.println(optionalUser.map(u -> u.getName()).orElse("anymos"));

        // map 是可以无限级联操作的
//        optionalUser.map(u -> u.getName()).map(name -> name.length()).orElse(0);
        System.out.println( optionalUser.map(u -> u.getName()).map(name -> name.length()).orElse(0));

    }


}
