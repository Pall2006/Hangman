package ru.bk.pall2006;

public class Gallows {
    public void buildGallows(int counter) {
        switch (counter) {
            case 1:
                System.out.println(
                        "   _______\n"
                                + "  |       |\n"
                                + "  |\n"
                                + "  |\n"
                                + "  |\n"
                                + "__|__");
                break;
            case 2:
                System.out.println(
                        "   _______\n"
                                + "  |       |\n"
                                + "  |       0\n"
                                + "  |\n"
                                + "  |\n"
                                + "__|__");
                break;
            case 3:
                System.out.println(
                        "   _______\n"
                                + "  |       |\n"
                                + "  |     __0__\n"
                                + "  |\n"
                                + "  |\n"
                                + "__|__");
                break;
            case 4:
                System.out.println(
                        "   _______\n"
                                + "  |       |\n"
                                + "  |     __0__\n"
                                + "  |       | \n"
                                + "  |\n"
                                + "__|__");
                break;
            case 5:
                System.out.println(
                        "   _______\n"
                                + "  |       |\n"
                                + "  |     __0__\n"
                                + "  |       | \n"
                                + "  |      /\n"
                                + "__|__");
                break;
            default:
                System.out.println(
                        "   _______\n"
                                + "  |       |\n"
                                + "  |     __0__\n"
                                + "  |       | \n"
                                + "  |      / \\\n"
                                + "__|__");
                break;
        }
    }
}
