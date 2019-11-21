package Dao;

import Banco.AcessoBanco;
import Classes.Candidato;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CandidatoDao {
   private final AcessoBanco acessoBanco= new AcessoBanco();
   private Connection conexao = acessoBanco.conector();
   private Candidato candidato;
   private PreparedStatement pst;
   private ResultSet rs;
   
   public CandidatoDao(){
       candidato = new Candidato();
   }
   public boolean salvarCandidato(Candidato candidato){
       
       try{
       pst = conexao.prepareStatement("insert into tbl_candidato(cpf,nome,email) values(?,?,?)");
       pst.setString(0,String.valueOf(candidato.getCpf()));
       pst.setString(1,String.valueOf(candidato.getNome()));
       pst.setString(2,candidato.getEmail());
       pst.executeUpdate();
       return true;
       }catch(SQLException e){
           System.out.println(e);
           return false;     
       }         
     
   }    
   public ResultSet recuperaCandidato(int cpf){
       try{
           pst = conexao.prepareStatement("select * from tbl_candidato where cpf=?");
           pst.setString(0, String.valueOf(cpf));
           rs = pst.executeQuery();
           return rs;
       }catch(SQLException e){
           System.out.println(e);
           return null;
       }              
       
   }
    public ResultSet recuperaCandidato(){
       try{
           pst = conexao.prepareStatement("select * from tbl_candidato");
           rs = pst.executeQuery();
           return rs;
       }catch(SQLException e){
           System.out.println(e);
           return null;
       }              
       
   }
   public boolean atribuiCandidatoInscricao(int id, int cpf){
       try{
          pst = conexao.prepareStatement("update tbl_candidato set id_inscricao = ? where cpf = ?");
          pst.setString(0,(String.valueOf(id)));
          pst.setString(1, String.valueOf(cpf));
          return true;
       }catch(SQLException e){
           System.out.println(e);
           return false;
       }
      
       
   }
}
