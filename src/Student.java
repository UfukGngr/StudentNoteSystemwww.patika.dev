public class Student {
    String name;
    String stuNo;
    int classes;
    Course fizik;
    Course kimya;
    Course bio;
    double average;
    double total;
    double teacherTotal;
    boolean isPass;


    Student(String name,String stuNo,int classes,Course fizik,Course kimya,Course bio ){
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.fizik=fizik;
        this.kimya=kimya;
        this.bio=bio;
        calcAverage();
        this.isPass=false;

    }

    void addBulkExamNote(int fzk,int kmy,int bio,int fzkTeacherNote,int kmyTeacherNote,int bioTeacherNote){
        if (fzk <=100 && fzk>=0 && fzkTeacherNote<=100 && fzkTeacherNote>=0){
            this.fizik.note=fzk;
            this.fizik.teacherNote=fzkTeacherNote;
        }
        if (kmy <=100 && kmy>=0 && kmyTeacherNote<=100 && kmyTeacherNote>=0){
            this.kimya.note=kmy;
            this.kimya.teacherNote=kmyTeacherNote;
        }
        if (bio <=100 && bio>=0 && bioTeacherNote<=100 && bioTeacherNote>=0){
            this.bio.note=bio;
            this.bio.teacherNote=bioTeacherNote;
        }

    }
    void isPass(){
        if(this.fizik.note==0 || this.kimya.note==0 || this.bio.note==0){
            System.out.println("Notlar tam olarak girilmemiş");
        }else {
            this.isPass=isCheckPass();
            printNote();
            System.out.println("Ortalama :" +this.average);
            if (this.isPass){
                System.out.println("Sınıfı geçti.");
            }else
                System.out.println("Sınıfta kaldı.");
        }

    }
    void calcAverage(){
        this.total=(this.fizik.note+this.kimya.note+this.bio.note)*(8/10.0);
        this.teacherTotal=(this.fizik.teacherNote+this.kimya.teacherNote+this.bio.teacherNote)*(2/10.0);
        this.average=(this.total+this.teacherTotal)/3.0;

    }
    boolean isCheckPass(){
        calcAverage();
        return this.average >55;
    }
    void printNote(){
        System.out.println("=================");
        System.out.println("Öğrenci: "+ this.name);
        System.out.println("Fizik Notu : "+ this.fizik.note);
        System.out.println("Kimya Notu : "+ this.kimya.note);
        System.out.println("Biyoloji Notu: "+ this.bio.note);
        System.out.println("Fizik sözlü notu :" +this.fizik.teacherNote);
        System.out.println("Kimya sözlü notu :" +this.kimya.teacherNote);
        System.out.println("Biyoloji sözlü notu :" +this.bio.teacherNote);
    }


}
