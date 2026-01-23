const employeeWage = {
    empRateHour : 20 ,
    maxWorkingDays : 20 ,
    maxWorkingHours : 100 ,
    totalHours: 0 ,
    dailyWages : [],

    getWorkingHours(empCheck){
        return empCheck === 1 ? 8 : 0 ;
    },
    
    computeWage(){
        let day = 0; 
        while(this.totalHours < this.maxWorkingHours && 
            day < this.maxWorkingDays
        ){
            day++ ;

            let empHours = this.getWorkingHours(Math.floor(Math.random()*2));

            this.totalHours += empHours ;
            this.dailyWages.push(empHours * this.empRateHour);
        }
    }
}

employeeWage.computeWage();

console.log("Total Wage : ", employeeWage.dailyWages.reduce((a,b)=> a+b, 0));