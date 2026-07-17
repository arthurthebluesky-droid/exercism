class Badge {
    public String print(Integer id, String name, String department) {
        String prefix = id != null?  "[" + id + "] - " : "";
        String sufix = department != null? " - " + department.toUpperCase() : " - OWNER"; 

        return prefix + name + sufix;
    }
}
