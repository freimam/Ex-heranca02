class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        Funcionario gerente = new Gerente(); //upcast - Gerente sobe a Funcionario (possuem objetos em comum, mas o especifico fica)
        Funcionario vendedor = new Vendedor(); //upcast
        Funcionario faxineiro = new Faxineiro(); //upcast

        //Gerente gerente_ = new Funcionario();
        Vendedor vendedor_ = (Vendedor) new Funcionario(); //downcast - funcionario desce a vendedor
        //ocorre erro nesta linha acima, pois nem todas as informações de Funcionario ficaram em vendedor 
        //não utilizar downcast em OO
    }
}