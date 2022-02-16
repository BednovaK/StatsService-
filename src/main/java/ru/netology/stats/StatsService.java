package ru.netology.stats;

//сумма продаж
public class StatsService {
    public long calculateSum(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }

    //Средняя сумма продаж
    public long findAvr(long[] sales) {
        return calculateSum(sales) / sales.length;
    }


//Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    //  Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

//Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)

    public int belowAvrMonth(long[] sales) {
        int count = 0;
        long findAvr = findAvr(sales);
        for (long sale : sales) {
            if (sale < findAvr) {
                count++;
            }
        }
        return count;
    }


//  Кол-во месяцев, в которых продажи были выше среднего

    public int overAvrMonth(long[] sales) {
        int count = 0;
        long findAvr = findAvr(sales);
        for (long sale : sales) {
            if (sale > findAvr) {
                count++;
            }
        }
        return count;
    }
}

