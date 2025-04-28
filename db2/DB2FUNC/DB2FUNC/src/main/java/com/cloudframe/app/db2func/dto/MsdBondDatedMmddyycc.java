package com.cloudframe.app.db2func.dto;

/**
*  The class MsdBondDatedMmddyycc is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:06. using version 5.0.0.256
**/


import com.cloudframe.app.db2func.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;


public class MsdBondDatedMmddyycc extends MsdBondDatedMmddyyccSerialized { 
   
				private MsdBondDatedMmddyy msdBondDatedMmddyy = new MsdBondDatedMmddyy();

								private int msdBondDatedCc;
	
	/**
	* Constructor for MsdBondDatedMmddyycc
	**/
    public MsdBondDatedMmddyycc() {
	// TO-DO auto generated code
    }


 
	/**
	* Constructor for MsdBondDatedMmddyycc. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public MsdBondDatedMmddyycc(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
     @Override
    public void setParent(Field parent,int begin) {
    	super.setParent(parent, begin);
	       			msdBondDatedMmddyy.setParent(this,getStartOffset() + 0);
    } 

	/**
	 *	Returns the value of msdBondDatedMmddyy
	 *	@return msdBondDatedMmddyy
	 */   
	 public MsdBondDatedMmddyy getMsdBondDatedMmddyy() {
   	return msdBondDatedMmddyy;
   }
   /**
	* 	Update MsdBondDatedMmddyy with the passed value
	*   Corresponding COBOL Variable is MSD-BOND-DATED-MMDDYY
	*	@param value
	*/
   public void setMsdBondDatedMmddyy(char[] value) {
      msdBondDatedMmddyy.setString(value); 
   }   
    
     /**
	 * 	Update MsdBondDatedMmddyy 
	 *     with a String from an offset and length             
	 *	@param value
	 */
   public void setMsdBondDatedMmddyy(char[] source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondDatedMmddyy.begin,msdBondDatedMmddyy.length());
   }
   
     /**
	 * 	Update MsdBondDatedMmddyy 
	 *     with a String from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondDatedMmddyy(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondDatedMmddyy.begin+targetIndex,targetLen);
   }
   
    /**
	 * 	Update MsdBondDatedMmddyy with another Field
	 *	@param value
	 */
   public void setMsdBondDatedMmddyy(Field source) {
   	replace(source,0,source.length(),msdBondDatedMmddyy.begin,msdBondDatedMmddyy.length());
   }  
   
     /**
	 * 	Update MsdBondDatedMmddyy 
	 *     with another Field from an offset and length             
	 *	@param value
	 */
   public void setMsdBondDatedMmddyy(Field source, int sourceIndex,int sourceLen) {
   	replace(source,sourceIndex,sourceLen,msdBondDatedMmddyy.begin,msdBondDatedMmddyy.length());
   }
   
     /**
	 * 	Update MsdBondDatedMmddyy 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setMsdBondDatedMmddyy(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
   	replace(source,sourceIndex,sourceLen,msdBondDatedMmddyy.begin+targetIndex,targetLen);
   }
	/**
	 *	Returns the value of msdBondDatedCc
	 *	@return msdBondDatedCc
	 */
	public int getMsdBondDatedCc() throws CFException {
       if (isMsdBondDatedCcModified()) { 
           msdBondDatedCc = refreshMsdBondDatedCc();
        }
   		return msdBondDatedCc;
	}
	

	
	   
	/**
	 * 	Update MsdBondDatedCc with the passed value
	 *  Corresponding COBOL Variable is MSD-BOND-DATED-CC
	 *	@param number
	 */
	public void setMsdBondDatedCc(int number) {
	     // Truncate if the number is beyond +/- Max range	
	    msdBondDatedCc = checkMsdBondDatedCcMaxLimit(number); 
		serializeMsdBondDatedCc(msdBondDatedCc);
	}
	

	public void setMsdBondDatedCc(long number) {
	    number = checkMsdBondDatedCcMaxLimit(number); // Truncate if value is beyond +/- Max range
		setMsdBondDatedCc((int)number);
	}
	
	/**
	 * 	Update MsdBondDatedCc with the passed value
	 *	@param value (String or char[])
	 */
	public void setMsdBondDatedCc(char[] value) throws CFException {
		 msdBondDatedCc = serializeMsdBondDatedCc(value);
	}
	/**
	 * 	Update MsdBondDatedCc with the passed value 
	 *
	 *	@param value (String or char[])
	 */
	public void setMsdBondDatedCcString(char[] value) throws CFException {
		 setMsdBondDatedCc(value);
	}

	
	
	
	/**
	 * 	initializes MsdBondDatedMmddyycc
	 *  String fields defaults to Spaces
	 *  short/int/long defaults to zero
	 *  BigDecimal defaults to BigDecimal.ZERO
	 */
   public void initialize() {
          msdBondDatedMmddyy.initialize();
     
                     setMsdBondDatedCc(0);
   }

		public static int getMsdBondDatedMmddyyccFieldLength() {
			return MSD_BOND_DATED_MMDDYYCC_LENGTH;
		}

}
  
