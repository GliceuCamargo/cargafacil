package colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.Vector;

public class Colecoes {

    public static void main(String[] args) {
        
        Cliente[] clin=new Cliente[10];
        clin[0]=new Cliente("Luciane","820", 1.2);
    
        ArrayList<Cliente> cliente = new ArrayList<>();
        cliente.add(new Cliente("Gliceu", "484", 2.4));
        cliente.add(new Cliente("aliceu", "584", 2.5));
        cliente.add(new Cliente("eliceu", "684", 2.6));
        cliente.add(new Cliente("iliceu", "784", 2.7));
        cliente.add(new Cliente("zliceu", "984", 2.8));
        
        ArrayList aList= new ArrayList();
        aList.add(0,"Gliceu");
        aList.add(1,"yilceu");
        System.out.println("---"+aList);
        Vector v=new Vector();
        v.addElement(10);
       
        System.out.println("/*/"+cliente.get(3).getNome());
        Object[]obj=new Object[10];
        obj[0]=new Funcionario("","",1.3);
        obj[1]=new Cliente("","",1.3);

        Iterator<Cliente> cliItr = cliente.iterator();
        while (cliItr.hasNext()) {
            Cliente cli = cliItr.next();
            System.out.println(cli.getNome() + "*" + cli.getCpf() + "**" + cli.getDebito());
        }
       

    /*    TelaCliente telaCliente = new TelaCliente();
        telaCliente.setVisible(true);*/

        /*  HashSet<String> hs = new HashSet();
        System.out.println(hs.add("Eliceu"));
        System.out.println(hs.add("Gliceu"));
        System.out.println(hs.add("Aliceu"));
        System.out.println(hs.add("Cliceu"));
        System.out.println(hs.add("Zliceu"));
        System.out.println(hs);
        HashSet<String> hs1 = new HashSet();
        hs1.add("Carlos");
    
        System.out.println(hs1.add("Cliceu"));
        System.out.println(hs1.add("Iliceu"));
        System.out.println(hs1.addAll(hs));
        System.out.println(hs1);*/
 /* ArrayList al = new ArrayList();
        System.out.println("Tamanho " + al.size());
        al.add(32.34);
        al.add("Gliceu");
        System.out.println("Tamanho " + al.size());
        System.out.println("0- " + al.get(0));
        System.out.println("1- " + al.get(1));
        al.addAll(al);
        System.out.println(al);
        al.addAll(al);
        System.out.println(al);*/
 /*   Cliente[] cli = new Cliente[3];
        cli[0] = new Cliente("Kaua", "434", 2.34);
        cli[0].getNome();

        ArrayList c = new ArrayList();
        c.add(new Cliente("Gliceu", "484", 34.54));
        c.add(new Funcionario("Renata", "435", 2456.45));
        System.out.println("* " + c);
        TreeSet ts = new TreeSet();
        ts.add("Valir");
        ts.add("Amélia");
        ts.add("Gliceu");
        ts.add("Kaua");
        ts.add("A");
        System.out.println(ts);*/
    }
}
