package repositorio;

import dominio.ClasseVeiculo;
import fakedb.ClasseVeiculoFakeDB;

public class ClasseVeiculoRepo extends BaseRepositorio<ClasseVeiculo> {

    public ClasseVeiculoFakeDB db;

    public ClasseVeiculoRepo(){
        this.db = new ClasseVeiculoFakeDB();
        this.dados = this.db.gettabela();
    }
    @Override
    public ClasseVeiculo Read(int chave) {
    for(ClasseVeiculo cp : this.dados){
        if (cp.getCodigo() == chave ) {
            return cp;
        }
    }
    return null;
}
    @Override
    public ClasseVeiculo Edit(ClasseVeiculo instancia) {
        ClasseVeiculo cp = this.Read(instancia.getCodigo());
        if(cp != null){
            cp.setMarca(instancia.getMarca());
            cp.setModelo(instancia.getModelo());
            cp.setanoFabricacao(instancia.getanoFabricacao());
            cp.setpreco(instancia.getpreco());
            return cp;
        }
        else{
            return null;
        }
    }

    @Override
    public ClasseVeiculo Add(ClasseVeiculo instancia) {
       int proxChave = this.getLast().getCodigo() + 1;
       instancia.setCodigo(proxChave);
       this.dados.add(instancia);
       return instancia;
    }

    public ClasseVeiculo getLast() {
    
        if (this.dados.isEmpty()) {
            return null;  
        }
        return this.dados.get(this.dados.size() - 1);
    }

    @Override
    public ClasseVeiculo Delet(int chave) {
     ClasseVeiculo cp = this.Delet(chave);
     if (cp != null) {
        this.dados.remove(cp);
        return cp;
     }
     else{
        return null;
      }
    } 
}
