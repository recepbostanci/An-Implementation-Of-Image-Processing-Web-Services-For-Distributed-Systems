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

/**
 * <i>INTERNAL USE ONLY</i>
 */
public class EdgeDetecProjectMCRFactory
{
   
    
    /** Component's uuid */
    private static final String sComponentId = "EdgeDetecPro_CBEFEE1AF357A7D042EE23DDEF2BE63E";
    
    /** Component name */
    private static final String sComponentName = "EdgeDetecProject";
    
   
    /** Pointer to default component options */
    private static final MWComponentOptions sDefaultComponentOptions = 
        new MWComponentOptions(
            MWCtfExtractLocation.EXTRACT_TO_CACHE, 
            new MWCtfClassLoaderSource(EdgeDetecProjectMCRFactory.class)
        );
    
    
    private EdgeDetecProjectMCRFactory()
    {
        // Never called.
    }
    
    public static MWMCR newInstance(MWComponentOptions componentOptions) throws MWException
    {
        if (null == componentOptions.getCtfSource()) {
            componentOptions = new MWComponentOptions(componentOptions);
            componentOptions.setCtfSource(sDefaultComponentOptions.getCtfSource());
        }
        return MWMCR.newInstance(
            componentOptions, 
            EdgeDetecProjectMCRFactory.class, 
            sComponentName, 
            sComponentId,
            new int[]{7,14,0}
        );
    }
    
    public static MWMCR newInstance() throws MWException
    {
        return newInstance(sDefaultComponentOptions);
    }
}
