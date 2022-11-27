public class Main {
    public static void main(String[] args) {
        Course fizik=new Course("Fizik","101","FZK" );
        Course kimya=new Course("Kimya","102","KMY" );
        Course bio=new Course("Biyoloji","103","BİO" );

        Teacher t1=new Teacher("Graham Bell","555","FZK");
        Teacher t2=new Teacher("Celal Şengör","55234","KMY");
        Teacher t3=new Teacher("Mendel","5523244","BİO");

        fizik.addTeacher(t1);
        kimya.addTeacher(t2);
        bio.addTeacher(t3);

        Student s1=new Student("Ufuk Güngör","007",12,fizik,kimya,bio);
        s1.addBulkExamNote(40,50,60,50,70,90);
        s1.isPass();
        s1.fizik.printTeacher();

        Student s2=new Student("Gamze Güngör","008",5,fizik,kimya,bio);
        s2.addBulkExamNote(60,70,80,60,70,80);
        s2.isPass();

        Student s3=new Student("İlker Arslan","009",3,fizik,kimya,bio);
        s3.addBulkExamNote(80,90,100,90,90,90);
        s3.isPass();


    }
}