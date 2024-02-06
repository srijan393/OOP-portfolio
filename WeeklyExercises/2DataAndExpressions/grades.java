public class grades {

        public static void main(String[] args) {
            // Student data
            String[] names = {"jack", "jimmy", "ibrahim", "teja", "koka"};
            int[] labPoints = {43, 50, 39, 45, 48};
            int[] bonusPoints = {7, 8, 10, 6, 9};

            // Print table header
            System.out.println("///////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\");
            System.out.println("==          Student Points          ==");
            System.out.println("\\\\\\\\\\\\\\\\\\\\\\\\\\\\///////////////////");

            // Print table columns
            System.out.println("Name\t \tLab \tBonus \tTotal");
            System.out.println("----\t \t--- \t----- \t-----");

            // Print student data
            for (int z = 0; z< names.length; z++) {
                String name = names[z];
                int lab = labPoints[z];
                int bonus = bonusPoints[z];
                int total = lab + bonus;

                // Print student row
                System.out.println(name + "\t\t" + lab + "\t" + bonus + "\t" + total);
            }
        }
    }


