interface testrec {
void area();
}
class Rectangle1 implements testrec {
@Override
public void area() {
int length = 27;
int breath = 45;
int area = length * breath;
System.out.println("area of rectangle :" + area);
}
public static void main(String[] args) {
Rectangle r = new Rectangle();
r.area();
}
}
