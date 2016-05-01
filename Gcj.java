import java.util.*;
import java.io.*;
public class Gcj {
  private int T;
  private BufferedReader buff;
  final static private boolean IS_DEBUG=true;
  // final static private boolean IS_DEBUG=false;

  private void read_args(){
    try{
      // INIT VARIABLES HERE
      buff.readLine();

    }
    catch(Exception e){
      System.err.println(e);
    }
    return;
  }

  private void debugInfo(String message){
    if(IS_DEBUG){
      System.err.println("debug: "+message);
    }
  }

  private void solve(){
    return;
  }

  public void run(){
    for(int i=0; i<T; i++){
      System.out.print(String.format("Case #%d: ", i+1));
      read_args();
      solve();
    }
    return;
  }

  Gcj(){
    buff=new BufferedReader(new InputStreamReader(System.in));
    try{
      T=Integer.parseInt(buff.readLine());
    }
    catch(Exception e){
      System.err.println(e);
    }
  }

  public static final void main(final String[] args) {
    new Gcj().run();
    return;
  }
}
