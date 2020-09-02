package br.com.unitymanager.combobox;

import java.util.ArrayList;

public class DadosComboBox {
    
   
    public ArrayList<ComboBoxString> dadosComboBoxTipoOS(){
        ArrayList<ComboBoxString> list = new ArrayList<>();
        list.add(new ComboBoxString("Assistência"));
        list.add(new ComboBoxString("Manutenção Preventiva"));
        list.add(new ComboBoxString("Orçamento"));
        list.add(new ComboBoxString("Venda"));
        return list;
    }
    
    public ArrayList<ComboBoxString> dadosComboBoxStatusOS(){
        ArrayList<ComboBoxString> list = new ArrayList<>();
        list.add(new ComboBoxString("Aberto"));
        list.add(new ComboBoxString("Concluída"));
        list.add(new ComboBoxString("Em atendimento"));
        list.add(new ComboBoxString("Aguardando peça"));
        list.add(new ComboBoxString("Análise"));
        list.add(new ComboBoxString("Cancelada"));
        list.add(new ComboBoxString("Aguardando peça"));
        return list;
    }
    
    
}
