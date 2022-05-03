package HW7;

import java.util.Locale;

public class Utils {
    public static String getWorkerByName(Worker[] workers, String workersName) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().equals(workersName)) {
                return workers[i].getName();
            }
        }
        return "can't find workers name";
    }

    public static String getAllWorkers(Worker[] workers, String workersName) {
        String allNames = "";
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().equals(workersName)) {
                allNames += workers[i].getName() + "\n";
            }
        }
        if (allNames.isEmpty()) {
            return "can't find" + workersName;
        } else {
            return allNames;
        }
    }

    public static Worker findByName(Worker[] worker, String workerName) {
        for (int i = 0; i < worker.length; i++) {
            if (workerName.equals(worker[i].getName())) {
                return worker[i];
            }
        }
        return null;
    }

    public static String getByPhrase(Worker[] workers, String phrase) {
        String allNames = "";
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().toLowerCase().contains(phrase.toLowerCase())) {
                allNames += workers[i].getName() + "\n";
            }
        }
        if (allNames.isEmpty()) {
            return "can't find" + phrase;
        } else {
            return allNames;
        }
    }

    public static double getTotalBudget(Worker[] workers) {
        double totalBudget = 0;
        for (int i = 0; i < workers.length; i++) {
            totalBudget += workers[i].getSalary();
        }
        return totalBudget;
    }
// поиск наименьшей зарплаты в массиве

    public static double getminSalary(Worker[] workers) {
        double min = workers[0].getSalary();
        for (int i = 1; i < workers.length; i++) {
            if (min > workers[i].getSalary()) {
                min = workers[i].getSalary();
            }
        }
        return min;
    }

    public static double getmaxSalary(Worker[] workers) {
        double max = workers[0].getSalary();
        for (int i = 1; i < workers.length; i++) {
            if (max < workers[i].getSalary()) {
                max = workers[i].getSalary();
            }
        }
        return max;
    }

// поиск наименьшего количества подчиненных в массиве менеджеров

    public static int getMinSubordinates(Manager[] managers) {
        int min = 0;
        for (int i = 0; i < managers.length; i++) {
            if (min > managers[i].getNumberOfSubordinates()) {
                min = managers[i].getNumberOfSubordinates();
            }
        }
        return min;
    }

    //поиск наибольшего количества подчиненных в массиве менеджеров
    public static Manager getMaxSubordinates(Manager[] managers) {
        Manager max = null;
        for (int i = 0; i < managers.length; i++) {
            if (max == null || max.getNumberOfSubordinates() < managers[i].getNumberOfSubordinates()) {
                max = managers[i];
            }
        }
        return max;
    }

    public static Manager getMaxSubordinates1(Manager[] managers) {
        if (managers == null || managers.length == 0) {
            return null;
        }
        Manager max = managers[0];
        for (int i = 0; i < managers.length; i++) {
            if (max.getNumberOfSubordinates() < managers[i].getNumberOfSubordinates()) {
                max = managers[i];
            }
        }
        return max;
    }
// поиск наибольшей надбавки (разнице между базовой зарплатой и выплатой) в массиве менеджеров

    public static double getMaxSalary(Manager[] managers) {
        double max = 0;
        for (int i = 0; i < managers.length; i++) {
            if (max < (managers[i].getSalary() - managers[i].getBaseSalary())) {
                max = (managers[i].getSalary() - managers[i].getBaseSalary());
            }
        }
        return max;
    }

    // поиск наименьшей надбавки (разнице между базовой ставки и зарплатой) в массиве менеджеров
    public static double getMinSalary(Manager[] managers) {
        double min = Double.MAX_VALUE;
        for (int i = 0; i < managers.length; i++) {
            double difference = (managers[i].getSalary() - managers[i].getBaseSalary());
            if (min > difference) {
                min = difference;
            }
        }
        return min;
    }
}
