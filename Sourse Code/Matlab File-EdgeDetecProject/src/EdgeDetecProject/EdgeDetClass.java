/*
 * MATLAB Compiler: 4.14 (R2010b)
 * Date: Tue Dec 06 20:57:08 2011
 * Arguments: "-B" "macro_default" "-W" "java:EdgeDetecProject,EdgeDetClass" "-T" 
 * "link:lib" "-d" "C:\\MatlabWorks\\EdgeDetecProject\\src" "-w" 
 * "enable:specified_file_mismatch" "-w" "enable:repeated_file" "-w" 
 * "enable:switch_ignored" "-w" "enable:missing_lib_sentinel" "-w" "enable:demo_license" 
 * "-v" "class{EdgeDetClass:C:\\MatlabWorks\\EdgeDetection.m}" 
 */

package EdgeDetecProject;

import com.mathworks.toolbox.javabuilder.*;
import com.mathworks.toolbox.javabuilder.internal.*;
import java.util.*;

/**
 * The <code>EdgeDetClass</code> class provides a Java interface to the M-functions
 * from the files:
 * <pre>
 *  C:\\MatlabWorks\\EdgeDetection.m
 * </pre>
 * The {@link #dispose} method <b>must</b> be called on a <code>EdgeDetClass</code> 
 * instance when it is no longer needed to ensure that native resources allocated by this 
 * class are properly freed.
 * @version 0.0
 */
public class EdgeDetClass extends MWComponentInstance<EdgeDetClass>
{
    /**
     * Tracks all instances of this class to ensure their dispose method is
     * called on shutdown.
     */
    private static final Set<Disposable> sInstances = new HashSet<Disposable>();

    /**
     * Maintains information used in calling the <code>EdgeDetection</code> M-function.
     */
    private static final MWFunctionSignature sEdgeDetectionSignature =
        new MWFunctionSignature(/* max outputs = */ 0,
                                /* has varargout = */ false,
                                /* function name = */ "EdgeDetection",
                                /* max inputs = */ 6,
                                /* has varargin = */ false);

    /**
     * Shared initialization implementation - private
     */
    private EdgeDetClass (final MWMCR mcr) throws MWException
    {
        super(mcr);
        // add this to sInstances
        synchronized(EdgeDetClass.class) {
            sInstances.add(this);
        }
    }

    /**
     * Constructs a new instance of the <code>EdgeDetClass</code> class.
     */
    public EdgeDetClass() throws MWException
    {
        this(EdgeDetecProjectMCRFactory.newInstance());
    }
    
    private static MWComponentOptions getPathToComponentOptions(String path)
    {
        MWComponentOptions options = new MWComponentOptions(new MWCtfExtractLocation(path),
                                                            new MWCtfDirectorySource(path));
        return options;
    }
    
    /**
     * @deprecated Please use the constructor {@link #EdgeDetClass(MWComponentOptions componentOptions)}.
     * The <code>com.mathworks.toolbox.javabuilder.MWComponentOptions</code> class provides API to set the
     * path to the component.
     * @param pathToComponent Path to component directory.
     */
    public EdgeDetClass(String pathToComponent) throws MWException
    {
        this(EdgeDetecProjectMCRFactory.newInstance(getPathToComponentOptions(pathToComponent)));
    }
    
    /**
     * Constructs a new instance of the <code>EdgeDetClass</code> class. Use this 
     * constructor to specify the options required to instantiate this component.  The 
     * options will be specific to the instance of this component being created.
     * @param componentOptions Options specific to the component.
     */
    public EdgeDetClass(MWComponentOptions componentOptions) throws MWException
    {
        this(EdgeDetecProjectMCRFactory.newInstance(componentOptions));
    }
    
    /** Frees native resources associated with this object */
    public void dispose()
    {
        try {
            super.dispose();
        } finally {
            synchronized(EdgeDetClass.class) {
                sInstances.remove(this);
            }
        }
    }
  
    /**
     * Invokes the first m-function specified by MCC, with any arguments given on
     * the command line, and prints the result.
     */
    public static void main (String[] args)
    {
        try {
            MWMCR mcr = EdgeDetecProjectMCRFactory.newInstance();
            mcr.runMain( sEdgeDetectionSignature, args);
            mcr.dispose();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
    
    /**
     * Calls dispose method for each outstanding instance of this class.
     */
    public static void disposeAllInstances()
    {
        synchronized(EdgeDetClass.class) {
            for (Disposable i : sInstances) i.dispose();
            sInstances.clear();
        }
    }

    /**
     * Provides the interface for calling the <code>EdgeDetection</code> M-function 
     * where the first input, an instance of List, receives the output of the M-function and
     * the second input, also an instance of List, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % GelenImage='C:/kiz.jpg';
     * % AlgoritmaTip='prewit';
     * % Threshold='Manuel';
     * % t=0.01;
     * % ScanType ='vertical';
     * % KayitYeri='c:/ist.jpg';
     * </pre>
     * </p>
     * @param lhs List in which to return outputs. Number of outputs (nargout) is
     * determined by allocated size of this List. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs List containing inputs. Number of inputs (nargin) is determined
     * by the allocated size of this List. Input arguments may be passed as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or
     * as arrays of any supported Java type. Arguments passed as Java types are
     * converted to MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void EdgeDetection(List lhs, List rhs) throws MWException
    {
        fMCR.invoke(lhs, rhs, sEdgeDetectionSignature);
    }

    /**
     * Provides the interface for calling the <code>EdgeDetection</code> M-function 
     * where the first input, an Object array, receives the output of the M-function and
     * the second input, also an Object array, provides the input to the M-function.
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % GelenImage='C:/kiz.jpg';
     * % AlgoritmaTip='prewit';
     * % Threshold='Manuel';
     * % t=0.01;
     * % ScanType ='vertical';
     * % KayitYeri='c:/ist.jpg';
     * </pre>
     * </p>
     * @param lhs array in which to return outputs. Number of outputs (nargout)
     * is determined by allocated size of this array. Outputs are returned as
     * sub-classes of <code>com.mathworks.toolbox.javabuilder.MWArray</code>.
     * Each output array should be freed by calling its <code>dispose()</code>
     * method.
     *
     * @param rhs array containing inputs. Number of inputs (nargin) is
     * determined by the allocated size of this array. Input arguments may be
     * passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     * @throws MWException An error has occurred during the function call.
     */
    public void EdgeDetection(Object[] lhs, Object[] rhs) throws MWException
    {
        fMCR.invoke(Arrays.asList(lhs), Arrays.asList(rhs), sEdgeDetectionSignature);
    }

    /**
     * Provides the standard interface for calling the <code>EdgeDetection</code>
     * M-function with 6 input arguments.
     * Input arguments may be passed as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>, or as arrays of
     * any supported Java type. Arguments passed as Java types are converted to
     * MATLAB arrays according to default conversion rules.
     *
     * <p>M-documentation as provided by the author of the M function:
     * <pre>
     * % GelenImage='C:/kiz.jpg';
     * % AlgoritmaTip='prewit';
     * % Threshold='Manuel';
     * % t=0.01;
     * % ScanType ='vertical';
     * % KayitYeri='c:/ist.jpg';
     * </pre>
     * </p>
     * @param rhs The inputs to the M function.
     * @return Array of length nargout containing the function outputs. Outputs
     * are returned as sub-classes of
     * <code>com.mathworks.toolbox.javabuilder.MWArray</code>. Each output array
     * should be freed by calling its <code>dispose()</code> method.
     * @throws MWException An error has occurred during the function call.
     */
    public Object[] EdgeDetection(Object... rhs) throws MWException
    {
        Object[] lhs = new Object[0];
        fMCR.invoke(Arrays.asList(lhs), 
                    MWMCR.getRhsCompat(rhs, sEdgeDetectionSignature), 
                    sEdgeDetectionSignature);
        return lhs;
    }
}
