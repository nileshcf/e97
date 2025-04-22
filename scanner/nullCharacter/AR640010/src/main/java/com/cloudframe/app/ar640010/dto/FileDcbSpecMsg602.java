package com.cloudframe.app.ar640010.dto;

/**
*  The class FileDcbSpecMsg602 is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-22 at 07:19. using version 5.0.0.254
**/


import com.cloudframe.app.ar640010.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class FileDcbSpecMsg602 extends FileDcbSpecMsg602Serialized {
   


						private char[] fileRecfm602 = new char[3];


								private long fileLrecl602;


								private long fileBlksz602;
	
	/**
	* Constructor for FileDcbSpecMsg602
	**/
    public FileDcbSpecMsg602() {
		super();
		/*  set the parent of each child as this which are a group variable */
	   	/*  end of offset */
       replaceValue( // serialize and save the value
             ("0021-FILE DCB SPEC: RECFM=").toCharArray()
             , getStartOffset() + 0
             ,26
             );
								setFileRecfm602(fillSpace(3));
       replaceValue( // serialize and save the value
             ("   LRECL=").toCharArray()
             , getStartOffset() + 29
             ,9
             );
								setFileLrecl602(0L);
       replaceValue( // serialize and save the value
             ("   BLKSIZE=").toCharArray()
             , getStartOffset() + 47
             ,11
             );
								setFileBlksz602(0L);
    }


 

	/**
	 *	Returns the value of fileRecfm602
	 *	@return fileRecfm602
	 */
   public char[] getFileRecfm602() throws CFException{
     if (isFileRecfm602Modified()) { 
        fileRecfm602 = refreshFileRecfm602();
     }
   		return fileRecfm602;
   }

  
	/**
	*  set variable fileRecfm602
	*  Corresponding COBOL Variable is 602-FILE-RECFM
	*  @param value
	**/
   public void setFileRecfm602(char[] value) {
      fileRecfm602 = checkFileRecfm602Constraints(value);
      serializeFileRecfm602(fileRecfm602);
   } 

     /**
	 * 	Update FileRecfm602 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setFileRecfm602(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginFileRecfm602,fileRecfm602.length);
   	
   }
   
   public void setFileRecfm602(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginFileRecfm602,fileRecfm602.length);
   	
   }
   
     /**
	 * 	Update FileRecfm602 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setFileRecfm602(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileRecfm602+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update FileRecfm602 with another Field
	 *	@param value
	 */
   public void setFileRecfm602(Field source) {
       replace(source,0,source.length(),beginFileRecfm602,FILE_RECFM_602_LEN);
   	
   }  
   
     /**
	 * 	Update FileRecfm602 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setFileRecfm602(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginFileRecfm602,FILE_RECFM_602_LEN);
   	
   }
   
     /**
	 * 	Update FileRecfm602 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setFileRecfm602(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginFileRecfm602+targetIndex,targetLen);
    
   }
	/**
	 *	Returns the value of fileLrecl602
	 *	@return fileLrecl602
	 */
	public long getFileLrecl602() throws CFException {
       if (isFileLrecl602Modified()) { 
           fileLrecl602 = refreshFileLrecl602();
        }
   		return fileLrecl602;
	}
	

	
	   
	/**
	 * 	Update FileLrecl602 with the passed value
	 *  Corresponding COBOL Variable is 602-FILE-LRECL
	 *	@param number
	 */
	public void setFileLrecl602(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    fileLrecl602 = checkFileLrecl602MaxLimit(number); 
		serializeFileLrecl602(fileLrecl602);
	}
	

	/**
	 * 	Update FileLrecl602 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFileLrecl602(char[] value) throws CFException {
		 fileLrecl602 = serializeFileLrecl602(value);
	}
	/**
	 * 	Update FileLrecl602 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFileLrecl602String(char[] value) throws CFException {
		 setFileLrecl602(value);
	}
	/**
	 *	Returns the value of fileBlksz602
	 *	@return fileBlksz602
	 */
	public long getFileBlksz602() throws CFException {
       if (isFileBlksz602Modified()) { 
           fileBlksz602 = refreshFileBlksz602();
        }
   		return fileBlksz602;
	}
	

	
	   
	/**
	 * 	Update FileBlksz602 with the passed value
	 *  Corresponding COBOL Variable is 602-FILE-BLKSZ
	 *	@param number
	 */
	public void setFileBlksz602(long number) {
	     // Truncate if the number is beyond +/- Max range	
	    fileBlksz602 = checkFileBlksz602MaxLimit(number); 
		serializeFileBlksz602(fileBlksz602);
	}
	

	/**
	 * 	Update FileBlksz602 with the passed value
	 *	@param value (String or char[])
	 */
	public void setFileBlksz602(char[] value) throws CFException {
		 fileBlksz602 = serializeFileBlksz602(value);
	}
	/**
	 * 	Update FileBlksz602 with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setFileBlksz602String(char[] value) throws CFException {
		 setFileBlksz602(value);
	}

	
	
	

		public static int getFileDcbSpecMsg602FieldLength() {
			return FILE_DCB_SPEC_MSG_602_LENGTH;
		}

}
  
