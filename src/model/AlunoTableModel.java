package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class AlunoTableModel extends AbstractTableModel {

    private List<Aluno> alunos = new ArrayList<>();
    private String[] colunas = {"Nome", "RA", "Curso", "Telefone"};

    @Override
    public String getColumnName(int coluna) {
        return colunas[coluna];
    }

    @Override
    public int getRowCount() {
        return alunos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {

        switch (coluna) {
            case 0:
                return alunos.get(linha).getNome();
            case 1:
                return alunos.get(linha).getRa();
            case 2:
                return alunos.get(linha).getCurso();
            case 3:
                return alunos.get(linha).getTelefone();
        }

        return null;
    }

    @Override
    public void setValueAt(Object valor, int linha, int coluna) {
        switch (coluna) {
            case 0:
                alunos.get(linha).setNome((String) valor);
                break;
            case 1:
                alunos.get(linha).setRa(Integer.parseInt((String) valor));
                break;
            case 2:
                alunos.get(linha).setCurso((String) valor);
                break;
            case 3:
                alunos.get(linha).setTelefone((String) valor);
        }

        this.fireTableRowsUpdated(linha, linha);
    }
    
    public Aluno getAluno(int linha){
        return alunos.get(linha);
    }
    
    public void addRow(Aluno a) {
        this.alunos.add(a);
        this.fireTableDataChanged();
    }

    public void removeRow(int linha) {
        this.alunos.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
}
