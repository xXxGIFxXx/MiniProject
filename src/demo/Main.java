package demo;// то есть здесь есть массивы с элементами name и value
// максимум 10 контактов
// при запуске есть меню из 4х команд:
// Новый контакт
//Редактировать контакт
//Удалить контакт
//Выйти
import javax.naming.Name;
import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Телефон");
        JPanel panel = new JPanel();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 80);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        JButton button1 = new JButton("Новый конатакт");                //1 слева
        panel.add(button1);

        JButton button2 = new JButton("Редактировать контакт");         //2 спправа
        panel.add(button2);

        JButton button3 = new JButton("Удалить контакт");               //3 слева
        panel.add(button3);

        JButton button4 = new JButton("Выйти");                          //4 справа
        panel.add(button4);




        button4.addActionListener(e -> {
            // Этот код будет выполняться при нажатии на кнопку
            System.exit(0);
        });
        Number1 number1 = new Number1();
        Number2 number2 = new Number2();
        Number3 number3 = new Number3();
        Number4 number4 = new Number4();
        Number5 number5 = new Number5();
        Number6 number6 = new Number6();
        Number7 number7 = new Number7();
        Number8 number8 = new Number8();
        Number9 number9 = new Number9();
        Number10 number10 = new Number10();
        //for (int i = 0; i<1; i++) {
            button1.addActionListener(e -> {
                // Этот код будет выполняться при нажатии на кнопку

                System.out.println("\nВведите в консоли имя");
                Scanner scan1 = new Scanner(System.in);
                String newName = scan1.nextLine();
                System.out.println("Введите в консоли номер");
                Scanner scan2 = new Scanner(System.in);
                String newValue = scan2.nextLine();
                //Contact contact = new Contact();
                //System.out.println(newName + ", " + newValue);

                if (number1.getName() == "00") {

                    number1.setName(newName);
                    number1.setValue(newValue);
                    System.out.println("Теперь этот номер на 1");
                } else {
                    if (number2.getName() == "00") {
                        number2.setName(newName);
                        number2.setValue(newValue);
                        System.out.println("Теперь этот номер на 2");

                    } else {
                        if (number3.getName() == "00") {
                            number3.setName(newName);
                            number3.setValue(newValue);
                            System.out.println("Теперь этот номер на 3");

                        } else {
                            if (number4.getName() == "00") {
                                number4.setName(newName);
                                number4.setValue(newValue);
                                System.out.println("Теперь этот номер на 4");

                            } else {
                                if (number5.getName() == "00") {
                                    number5.setName(newName);
                                    number5.setValue(newValue);
                                    System.out.println("Теперь этот номер на 5");

                                } else {
                                    if (number6.getName() == "00") {
                                        number6.setName(newName);
                                        number6.setValue(newValue);
                                        System.out.println("Теперь этот номер на 6");

                                    } else {
                                        if (number7.getName() == "00") {
                                            number7.setName(newName);
                                            number7.setValue(newValue);
                                            System.out.println("Теперь этот номер на 7");

                                        } else {
                                            if (number8.getName() == "00") {
                                                number8.setName(newName);
                                                number8.setValue(newValue);
                                                System.out.println("Теперь этот номер на 8");

                                            } else {

                                                if (number9.getName() == "00") {
                                                    number9.setName(newName);
                                                    number9.setValue(newValue);
                                                    System.out.println("Теперь этот номер на 9");

                                                } else {
                                                    if (number10.getName() == "00") {
                                                        number10.setName(newName);
                                                        number10.setValue(newValue);
                                                        System.out.println("Теперь этот номер на 10");
                                                    } else {
                                                        System.out.println("Не хватает памяти");
                                                    }

                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                }

                System.out.println(number1.getName() + " " + number1.getValue());
                System.out.println(number2.getName() + " " + number2.getValue());
                System.out.println(number3.getName() + " " + number3.getValue());
                System.out.println(number4.getName() + " " + number4.getValue());
                System.out.println(number5.getName() + " " + number5.getValue());
                System.out.println(number6.getName() + " " + number6.getValue());
                System.out.println(number7.getName() + " " + number7.getValue());
                System.out.println(number8.getName() + " " + number8.getValue());
                System.out.println(number9.getName() + " " + number9.getValue());
                System.out.println(number10.getName() + " " + number10.getValue());
             });
                button2.addActionListener(v -> {
                    System.out.println("Введите номер который будем менять");
                    Scanner scan3 = new Scanner(System.in);
                            int kakoy = scan3.nextInt();
                    if (kakoy >0 && kakoy <11) {
                        System.out.println("Введите в консоли изменение имени");
                        Scanner scan4 = new Scanner(System.in);
                        String newName = scan4.nextLine();
                        System.out.println("Введите в консоли изменение номера");
                        Scanner scan5 = new Scanner(System.in);
                        String newValue = scan5.nextLine();


                        if (kakoy == 1) {
                            number1.setName(newName);
                            number1.setValue(newValue);
                            System.out.println("Номер 1 скорректирован");
                        } else {
                            if (kakoy == 2) {
                                number2.setName(newName);
                                number2.setValue(newValue);
                                System.out.println("Номер 2 скорректирован");

                            } else {
                                if (kakoy == 3) {
                                    number3.setName(newName);
                                    number3.setValue(newValue);
                                    System.out.println("Номер 3 скорректирован");

                                } else {
                                    if (kakoy == 4) {
                                        number4.setName(newName);
                                        number4.setValue(newValue);
                                        System.out.println("Номер 4 скорректирован");

                                    } else {
                                        if (kakoy == 5) {
                                            number5.setName(newName);
                                            number5.setValue(newValue);
                                            System.out.println("Номер 5 скорректирован");

                                        } else {
                                            if (kakoy == 6) {
                                                number6.setName(newName);
                                                number6.setValue(newValue);
                                                System.out.println("Номер 6 скорректирован");

                                            } else {
                                                if (kakoy == 7) {
                                                    number7.setName(newName);
                                                    number7.setValue(newValue);
                                                    System.out.println("Номер 7 скорректирован");

                                                } else {
                                                    if (kakoy == 8) {
                                                        number8.setName(newName);
                                                        number8.setValue(newValue);
                                                        System.out.println("Номер 8 скорректирован");

                                                    } else {
                                                        if (kakoy == 9) {
                                                            number9.setName(newName);
                                                            number9.setValue(newValue);
                                                            System.out.println("Номер 9 скорректирован");

                                                        } else {
                                                            if (kakoy == 10) {
                                                                number10.setName(newName);
                                                                number10.setValue(newValue);
                                                                System.out.println("Номер 10 скорректирован");
                                                            } else {

                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }else{
                        System.out.println("Введите корректное значение");
                    }
                    System.out.println(number1.getName() + " " + number1.getValue());
                    System.out.println(number2.getName() + " " + number2.getValue());
                    System.out.println(number3.getName() + " " + number3.getValue());
                    System.out.println(number4.getName() + " " + number4.getValue());
                    System.out.println(number5.getName() + " " + number5.getValue());
                    System.out.println(number6.getName() + " " + number6.getValue());
                    System.out.println(number7.getName() + " " + number7.getValue());
                    System.out.println(number8.getName() + " " + number8.getValue());
                    System.out.println(number9.getName() + " " + number9.getValue());
                    System.out.println(number10.getName() + " " + number10.getValue());
            });
                button3.addActionListener(e -> {
                    System.out.println("Введите номер который будем далять");
                    Scanner scan3 = new Scanner(System.in);
                    int delete = scan3.nextInt();
                    if (delete >0 && delete <11) {



                        if (delete == 1) {
                            number1.setName("00");
                            number1.setValue("00");
                            System.out.println("Номер 1 удален");
                        } else {
                            if (delete == 2) {
                                number2.setName("00");
                                number2.setValue("00");
                                System.out.println("Номер 2 удален");

                            } else {
                                if (delete == 3) {
                                    number3.setName("00");
                                    number3.setValue("00");
                                    System.out.println("Номер 3 удален");

                                } else {
                                    if (delete == 4) {
                                        number4.setName("00");
                                        number4.setValue("00");
                                        System.out.println("Номер 4 удален");

                                    } else {
                                        if (delete == 5) {
                                            number5.setName("00");
                                            number5.setValue("00");
                                            System.out.println("Номер 5 удален");

                                        } else {
                                            if (delete == 6) {
                                                number6.setName("00");
                                                number6.setValue("00");
                                                System.out.println("Номер 6 удален");

                                            } else {
                                                if (delete == 7) {
                                                    number7.setName("00");
                                                    number7.setValue("00");
                                                    System.out.println("Номер 7 удален");

                                                } else {
                                                    if (delete == 8) {
                                                        number8.setName("00");
                                                        number8.setValue("00");
                                                        System.out.println("Номер 8 удален");

                                                    } else {
                                                        if (delete == 9) {
                                                            number9.setName("00");
                                                            number9.setValue("00");
                                                            System.out.println("Номер 9 удален");

                                                        } else {
                                                            if (delete == 10) {
                                                                number10.setName("00");
                                                                number10.setValue("00");
                                                                System.out.println("Номер 10 удален");
                                                            } else {

                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }else{
                        System.out.println("Введите корректное значение");
                    }
                    System.out.println(number1.getName() + " " + number1.getValue());
                    System.out.println(number2.getName() + " " + number2.getValue());
                    System.out.println(number3.getName() + " " + number3.getValue());
                    System.out.println(number4.getName() + " " + number4.getValue());
                    System.out.println(number5.getName() + " " + number5.getValue());
                    System.out.println(number6.getName() + " " + number6.getValue());
                    System.out.println(number7.getName() + " " + number7.getValue());
                    System.out.println(number8.getName() + " " + number8.getValue());
                    System.out.println(number9.getName() + " " + number9.getValue());
                    System.out.println(number10.getName() + " " + number10.getValue());
                });
            frame.getContentPane().add(BorderLayout.SOUTH, panel);
            frame.setVisible(true);
            frame.setAlwaysOnTop(true);
                }
    }

