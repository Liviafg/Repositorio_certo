package app;

import io.jooby.Jooby;

public class App extends Jooby {

  {

    mvc(new Controller(/soma/{operador}));
    mvc (new Soma());
  }

  public static void main(final String[] args) {
    runApp(args, App::new);
  }

}
