package largesetofclasses.afterrefaactor;

//	Powiazanie z diagramem UML:
//            Abstraction ~ GUIElementRenderer
    //            AbstrType1 ~ GUIElementRendererLinuxStyle
    //            AbstrType2 ~ GUIElementRendererInWindowsStyle
    //
//            Implementation ~ Widget //tez w pewnym sensie abstrakcja
    //            ConcreteImpl1 ~ Button
    //            ConcreteImpl2 ~ CheckBox
    //
//            Widget --agregacja--> GUIElementRenderer


//before refactorn F(n, k) = 1 + n*k

//F(n, k) = 2 + n + k
public class Main {
    public static void main(String[] args) {

    }
}
