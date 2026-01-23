class EmployeeWage {
    constructor(company, empRatePerHour, maxWorkingDays, maxWorkingHours) {
        this.company = company;
        this.empRatePerHour = empRatePerHour;
        this.maxWorkingDays = maxWorkingDays;
        this.maxWorkingHours = maxWorkingHours;
        this.totalEmpHours = 0;
        this.totalWorkingDays = 0;
        this.dailyWages = [];
    }

    getWorkingHours(empCheck) {
        switch (empCheck) {
            case EmployeeWage.IS_FULL_TIME:
                return 8;
            case EmployeeWage.IS_PART_TIME:
                return 4;
            default:
                return 0;
        }
    }

    computeWage() {
        while (this.totalEmpHours < this.maxWorkingHours &&
               this.totalWorkingDays < this.maxWorkingDays) {

            this.totalWorkingDays++;
            let empCheck = Math.floor(Math.random() * 3);
            let empHours = this.getWorkingHours(empCheck);

            this.totalEmpHours += empHours;
            let dailyWage = empHours * this.empRatePerHour;
            this.dailyWages.push(dailyWage);
        }
    }

    getTotalWage() {
        return this.dailyWages.reduce((sum, wage) => sum + wage, 0);
    }

    toString() {
        return `Company: ${this.company}
        Daily Wages: ${this.dailyWages.join(", ")}
        Total Wage: ${this.getTotalWage()}`;
    }
}

// Static constants
EmployeeWage.IS_PART_TIME = 1;
EmployeeWage.IS_FULL_TIME = 2;

// Execution
let dmart = new EmployeeWage("DMart", 20, 20, 100);
dmart.computeWage();
console.log(dmart.toString());




