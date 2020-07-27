package be.unamur.metamodel.exception;

public class MetaElementNotFoundException extends RuntimeException {
  public MetaElementNotFoundException() { super(); }
  public MetaElementNotFoundException(String msg) { super(msg); }
}
