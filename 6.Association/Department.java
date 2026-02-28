public class Department {

    public String dname;
    public University belongsTo;

    public Department(String dname, University belongsTo) {
        this.dname = dname;
        this.belongsTo = belongsTo;
        belongsTo.departments.add(this);
    }

    // Getters & Setters
    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public University getBelongsTo() {
        return belongsTo;
    }

    public void setBelongsTo(University belongsTo) {
        this.belongsTo = belongsTo;
    }
}