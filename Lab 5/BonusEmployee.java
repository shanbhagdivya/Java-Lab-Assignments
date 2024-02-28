public class BonusEmployee extends Employee {

    @Override
    public double theMonthly() {


        setBasicWage(((getGrossWage()/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()))*0.45);

        setHra(getBasicWage()*0.4);

        setConveyanceAllowance((1600/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()));

        setMedicalAllowance((1250/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()));

        setOtherAllowance(((getGrossWage()/getTotalWorkingDays())*(getTotalWorkingDays()-getLop()))-getBasicWage()-getHra()-getConveyanceAllowance()-getMedicalAllowance());

        setTotalEarnings(getBasicWage() + getHra() + getConveyanceAllowance() + getMedicalAllowance() + getOtherAllowance());

        if(getBasicWage()>=15000)
        {
            setEPF(15000*0.12);
        }
        else {
            setEPF(getBasicWage()*0.15);
        }

        if(getGrossWage()<=21000)
        {
            setHealthInsuranceAmt(getTotalEarnings()*0.0075);
        }
        else
        {
            setHealthInsuranceAmt(0);
        }

        setPT(0);

        setLoanRecovery(0);
        setTotalDeductions(getEPF() + getHealthInsuranceAmt() + getPT() + getLoanRecovery());
        setNet_salary(getTotalEarnings() - getTotalDeductions());
        setNet_salary((getNet_salary()*getBonus())+getNet_salary());


        return getNet_salary();

    }


}
