
public class SimpleDate {

    private int day;
    private int month;
    private int year;

    public SimpleDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean before(SimpleDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month &&
                this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance() {
        if (this.day < 30) {
            this.day++;
        } else {
            this.day = 1;
            if (this.month == 12) {
                this.month = 1;
                this.year++;
            } else {
                this.month++;
            }
        }
    }

    public void advance(int howManyDays) {
        this.year += howManyDays / 360;
        if (360 - (this.month * 30 + this.day) < howManyDays % 360) {
            this.year++;
        }
        if (this.day < 30 - howManyDays % 30) {
            this.day += howManyDays % 30;
        } else {
            this.day += howManyDays % 30;
            this.day -= 30;
            this.month++;
        }
        this.month += howManyDays / 30;
        while (this.month > 12) {
            this.month -= 12;
        }
    }

    public SimpleDate afterNumberOfDays(int days) {
        SimpleDate newDate = new SimpleDate(this.day, this.month, this.year);
        newDate.advance(days);
        return newDate;
    }

}
