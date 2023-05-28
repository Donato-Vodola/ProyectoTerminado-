/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Antonio
 */
public class Proyecto{
    public static Grafo miGrafo;
    
    
        public static Grafo extraerGrafo(File file){
        Grafo res = null;
        Lista<Usuario> verticesList = new Lista();
            
         try {
            
            Scanner scanner = new Scanner(file);
            
          
            if(scanner.hasNextLine()) scanner.nextLine();
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                if(line.equals("Relaciones")) break;
                String[] parts = line.split(", @");
                for(int i = 0; i < parts.length; i++) parts[i] = parts[i].trim();
                verticesList.insertarInicio(new Usuario(Integer.parseInt(parts[0]), parts[1]));
             System.out.println("1");   
            }
            Usuario[] vertices = new Usuario[verticesList.size()];            
            Nodo<Usuario> actual = verticesList.getPfirst(); 
            for(int i = 0; i < verticesList.size(); i++) {
                vertices[i] = actual.getElement(); 
                actual = actual.getPnext();
            }
            res = new Grafo(vertices);
            
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(",");
                for(int i = 0; i < parts.length; i++) parts[i] = parts[i].trim();
                res.insertarAristaValor(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]));
            }
            
            scanner.close();            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "File not found: " + e.getMessage()+ "\nTry again");
                    
        }
        
       
       return res;
    }
    
    private static void guardarGrafo(Grafo grafo, File ruta){
        try{
        FileWriter fileWriter = new FileWriter(ruta);
        PrintWriter printWriter = new PrintWriter(fileWriter);
        
        printWriter.println("Usuarios");
        Usuario[] usuarios = grafo.getUsuarios();
        for(Usuario usuario : usuarios){
            if(usuario == null) break;
            printWriter.println(usuario.getId()+", @"+ usuario.getNickname());
        }
        printWriter.println("Relaciones");
        Arista[] aristas = grafo.getAristas();
        for(Arista arista : aristas){
            printWriter.println(usuarios[arista.getOrigen()].getId()+", "+ usuarios[arista.getDestino()].getId() +", "+ arista.getPeso());
        }
        
        printWriter.close();
            System.out.println("sirvio guardar");
    }catch(Exception e){
            System.out.println("Error " + e);
    }
    }
    
    public static void main(String[] args){
        JFileChooser file=new JFileChooser();
        file.showOpenDialog(file);
   
        File abre=file.getSelectedFile();
        miGrafo = extraerGrafo(abre);
        Usuario sapo = new Usuario(9, "ahuyagfiasujdsajksdjkdskjsdajksda");
        miGrafo.agregarUsuario(sapo);
        guardarGrafo(miGrafo, abre);
        miGrafo = extraerGrafo(abre);
//        System.out.println(miGrafo + " Someeeeer");//revisar
        Usuario juanito = new Usuario(696, "7189899898998998");
        
        miGrafo.agregarUsuario(juanito);
        guardarGrafo(miGrafo, abre);
        miGrafo = extraerGrafo(abre);
        miGrafo.insertarAristaValor(juanito.getId(), miGrafo.getUsuarios()[2].getId(), 4);
        guardarGrafo(miGrafo, abre);
        try{
            System.out.println(miGrafo + " probando");
        }catch (Exception e){
            System.out.println("error en 112");
        }
        
//        miGrafo = extraerGrafo(abre);
//        
//        JFileChooser fileChooser = new JFileChooser();
//
//        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de texto", "txt");
//        fileChooser.setFileFilter(filter);
//           
//        int result = fileChooser.showOpenDialog(null);
//
//        if (result == JFileChooser.APPROVE_OPTION) {
//           
//            java.io.File selectedFile = fileChooser.getSelectedFile();
//            
//
//            // Opciones para guardar o descartar el archivo
//            int option = JOptionPane.showOptionDialog(null, "¿Deseas guardar los datos actuales antes de cargar un nuevo archivo?",
//                    "Advertencia", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE, null,
//                    new Object[]{"Guardar", "Descartar", "Cancelar"}, "Guardar");
//
//            if (option == JOptionPane.YES_OPTION) {
//                
//                
//                String ruta = "archivos//texto.txt";
//
//                try {
//                   
//                    PrintWriter writer = new PrintWriter(new FileWriter(abre));
//
//                   
//                    writer.close();
//
//
//                    JOptionPane.showMessageDialog(null, "Archivo cargado exitosamente.");
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                    JOptionPane.showMessageDialog(null, "Error al guardar el archivo");
//                }
//            }
//        } else {
//            JOptionPane.showMessageDialog(null, "La carga de archivo se ha cancelado");
//        }
    }
}
