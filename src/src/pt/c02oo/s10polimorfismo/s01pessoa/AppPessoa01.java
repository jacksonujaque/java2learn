package pt.c02oo.s10polimorfismo.s01pessoa;

public class AppPessoa01
{
    public static void main(String[] args)
    {
        Alguem umaPessoa;
        
        umaPessoa = new Melissa();
        
        mensagem(umaPessoa);
    }

    public static void mensagem(Alguem umAlguem)
    {
        System.out.println(umAlguem.getNome() +
                           " trouxe o trombone");
    }
}
