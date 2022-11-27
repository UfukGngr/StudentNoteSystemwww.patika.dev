public class Course {
    String name;
    String code;
    String prefix;
    int note;
    int teacherNote;
    Teacher teacher;

    Course(String name,String code,String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.teacherNote=0;

    }
    void addTeacher(Teacher teacher){
        if(this.prefix.equals(teacher.branch)){
            this.teacher=teacher;
            System.out.println("İşlem başarılı");
        }else
            System.out.println(teacher.name+" isimli akademisyen bu dersi veremez");

    }
    void printTeacher(){
        if(teacher!=null){
            System.out.println(this.name +" dersinin akademisyeni: "+this.teacher.name);
        }else
            System.out.println(this.name+ " dersine akademisyen atanmamıştır.");
    }

}
