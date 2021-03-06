package cn.edu.neu.cloudlab.haolap.exception;

/**
 * this exception will be thrown while adding a dimension that already exist in
 * the dimension server
 * <p/>
 * although the Dimension class promise that all the dimensions have different
 * names, but we cannot promise that dimensions in client and dimensions in
 * server are different
 *
 * @author Neoh
 */
public class SchemaAlreadyExistsException extends CubeException {

    /**
     *
     */
    private static final long serialVersionUID = -5587135369447105867L;

    public SchemaAlreadyExistsException() {
        super();
    }

    public SchemaAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public SchemaAlreadyExistsException(String message) {
        super(message);
    }

    public SchemaAlreadyExistsException(Throwable cause) {
        super(cause);
    }

}
