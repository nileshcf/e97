package com.cloudframe.app.ip343900.dto;

/**
*  The class Ip28221PaTableRestart is used to handle fields declared in it
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:33. using version 5.0.0.254
**/


import com.cloudframe.app.ip343900.dto.serialize.*;
import com.cloudframe.app.exception.CFException;
import com.cloudframe.app.data.Field;
import java.util.*;


public class Ip28221PaTableRestart extends Ip28221PaTableRestartSerialized {
   

								private short ip28221PaTableLength;

						private char[] ip28221Restart = Field.fillLowValue(1);
			private List<Ip28221RestartTable> ip28221RestartTable = new ArrayList<>();
    	

						private char[] ip28221Filler = Field.fillLowValue(39);
	
	/**
	* Constructor for Ip28221PaTableRestart
	**/
    public Ip28221PaTableRestart() {
		super();
		/*  set the parent of each child as this which are a group variable */
				for (int arrayIndex = 0; arrayIndex < IP_28221_RESTART_TABLE_SIZE;arrayIndex++) {
						ip28221RestartTable.add(new Ip28221RestartTable(this, beginIp28221RestartTable + 
						arrayIndex * Ip28221RestartTable.getIp28221RestartTableFieldLength()));
				}
	   	/*  end of offset */
    }


 

	/**
	 *	Returns the value of ip28221PaTableLength
	 *	@return ip28221PaTableLength
	 */
	public short getIp28221PaTableLength() throws CFException {
        if (isIp28221PaTableLengthModified()) { 
           ip28221PaTableLength = refreshIp28221PaTableLength();
        }
   		return ip28221PaTableLength;
	}
	
	/**
	 * 	Update Ip28221PaTableLength with the passed value
	 *  Corresponding COBOL Variable is IP28221-PA-TABLE-LENGTH
	 *	@param number
	 */
	public void setIp28221PaTableLength(short number) {
	     // Truncate if the number is beyond +/- Max range
	    ip28221PaTableLength = checkIp28221PaTableLengthMaxLimit(number); 
		serializeIp28221PaTableLength(ip28221PaTableLength);
	}

	public void setIp28221PaTableLength(int number) {
	    number = checkIp28221PaTableLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp28221PaTableLength((short)number);
	}
	public void setIp28221PaTableLength(long number) {
	    number = checkIp28221PaTableLengthMaxLimit((short)number); // Truncate if value is beyond +/- Max range
		setIp28221PaTableLength((short)number);
	}
	

	/**
	 *	Returns the value of ip28221Restart
	 *	@return ip28221Restart
	 */
   public char[] getIp28221Restart() throws CFException{
     if (isIp28221RestartModified()) { 
        ip28221Restart = refreshIp28221Restart();
     }
   		return ip28221Restart;
   }

  
	/**
	*  set variable ip28221Restart
	*  Corresponding COBOL Variable is IP28221-RESTART
	*  @param value
	**/
   public void setIp28221Restart(char[] value) {
      ip28221Restart = checkIp28221RestartConstraints(value);
      serializeIp28221Restart(ip28221Restart);
   } 

     /**
	 * 	Update Ip28221Restart 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp28221Restart(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp28221Restart,ip28221Restart.length);
   	
   }
   
   public void setIp28221Restart(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp28221Restart,ip28221Restart.length);
   	
   }
   
     /**
	 * 	Update Ip28221Restart 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp28221Restart(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp28221Restart+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip28221Restart with another Field
	 *	@param value
	 */
   public void setIp28221Restart(Field source) {
       replace(source,0,source.length(),beginIp28221Restart,IP_28221_RESTART_LEN);
   	
   }  
   
     /**
	 * 	Update Ip28221Restart 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp28221Restart(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp28221Restart,IP_28221_RESTART_LEN);
   	
   }
   
     /**
	 * 	Update Ip28221Restart 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp28221Restart(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp28221Restart+targetIndex,targetLen);
    
   }
	char[] ip28221Ip282210NoRestrt8888Value = "N".toCharArray();
	/**
	 *	Test condition "N" for isIp28221Ip282210NoRestrt88()
	 *	@return  Returns true if isIp28221Ip282210NoRestrt88() is "N"
	 */
   public boolean isIp28221Ip282210NoRestrt88() throws CFException {
      return (  compareChars( getIp28221Restart() , ip28221Ip282210NoRestrt8888Value)  == 0  );
   }


	/**
	*  set values "N"
	*/
   	public void setIp28221Ip282210NoRestrt88True() {  			
    	setIp28221Restart( ip28221Ip282210NoRestrt8888Value);
   	}
	char[] ip28221Ip282210Restart8888Value = "R".toCharArray();
	/**
	 *	Test condition "R" for isIp28221Ip282210Restart88()
	 *	@return  Returns true if isIp28221Ip282210Restart88() is "R"
	 */
   public boolean isIp28221Ip282210Restart88() throws CFException {
      return (  compareChars( getIp28221Restart() , ip28221Ip282210Restart8888Value)  == 0  );
   }


	/**
	*  set values "R"
	*/
   	public void setIp28221Ip282210Restart88True() {  			
    	setIp28221Restart( ip28221Ip282210Restart8888Value);
   	}
	/**
	 *	Returns the  value of ip28221RestartTable
	 *  Corresponding COBOL Variable is IP28221-RESTART-TABLE
	 *	@return ip28221RestartTable
	 */
   public List<Ip28221RestartTable> getIp28221RestartTable() {
       return ip28221RestartTable;
   }
	
	/**
	 *	Returns the element at the specified position in this list.
	 *  @param index
	 *	@return ip28221RestartTable
	 */
	public Ip28221RestartTable getIp28221RestartTable(int index) {
	   if (index < 0) {
		    logger.trace("Array index was {} for getIp28221RestartTable(), resetting it to 0",index);
		    index = 0;
	    } else if (index >= IP_28221_RESTART_TABLE_SIZE) {
             	index = IP_28221_RESTART_TABLE_SIZE -1; // can't exceed max array size
             	logger.trace("ip28221RestartTable - Array index exceeded max Size {}, resetting it to max allowed",IP_28221_RESTART_TABLE_SIZE); 
	    }
		if (index >= ip28221RestartTable.size()) {
       		for (int fillIndex =  ip28221RestartTable.size() -1; fillIndex < index;fillIndex++) {
		       ip28221RestartTable.add(null);
		    }
			ip28221RestartTable.set(index,
			   	   	new Ip28221RestartTable(this,beginIp28221RestartTable + index * Ip28221RestartTable.getIp28221RestartTableFieldLength()) 
				                        ); 	
		} 
   	   Ip28221RestartTable value = ip28221RestartTable.get(index);
   	   if (value == null) {
   	      ip28221RestartTable.set(index,
			   	   	new Ip28221RestartTable(this,beginIp28221RestartTable + index * Ip28221RestartTable.getIp28221RestartTableFieldLength()) 
				                        ); 
		  value = ip28221RestartTable.get(index);
   	   }
   	   return value;
   	   
        }
  
  	/**
	 *	Update Ip28221RestartTable at index with the passed value
	 *  Corresponding COBOL Variable is IP28221-RESTART-TABLE
	 *  @param index
	 *	@param value
	 */
  public void setIp28221RestartTable(int index,char[] value) {
   	getIp28221RestartTable(index).setString(value);
   }
   
	
	/**
	 *	Returns the value of ip28221Filler
	 *	@return ip28221Filler
	 */
   public char[] getIp28221Filler() throws CFException{
     if (isIp28221FillerModified()) { 
        ip28221Filler = refreshIp28221Filler();
     }
   		return ip28221Filler;
   }

  
	/**
	*  set variable ip28221Filler
	*  Corresponding COBOL Variable is IP28221-FILLER
	*  @param value
	**/
   public void setIp28221Filler(char[] value) {
      ip28221Filler = checkIp28221FillerConstraints(value);
      serializeIp28221Filler(ip28221Filler);
   } 

     /**
	 * 	Update Ip28221Filler 
	 *     with a char[] from an offset and length             
	 *	@param value
	 */
   public void setIp28221Filler(char[] source, int sourceIndex) {
       replace(source,sourceIndex,source.length,beginIp28221Filler,ip28221Filler.length);
   	
   }
   
   public void setIp28221Filler(char[] source, int sourceIndex , int sourceLen) {
       replace(source,sourceIndex,sourceLen,beginIp28221Filler,ip28221Filler.length);
   	
   }
   
     /**
	 * 	Update Ip28221Filler 
	 *     with a char[] from an offset and length  
	 *                     to  an offset and length         
	 *	@param value
	 */
   public void setIp28221Filler(char[] source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp28221Filler+targetIndex,targetLen);
   
   }
   
    /**
	 * 	Update Ip28221Filler with another Field
	 *	@param value
	 */
   public void setIp28221Filler(Field source) {
       replace(source,0,source.length(),beginIp28221Filler,IP_28221_FILLER_LEN);
   	
   }  
   
     /**
	 * 	Update Ip28221Filler 
	 *     with another Field from an offset and length          
	 *	@param value
	 */
   public void setIp28221Filler(Field source, int sourceIndex,int sourceLen) {
        replace(source,sourceIndex,sourceLen,beginIp28221Filler,IP_28221_FILLER_LEN);
   	
   }
   
     /**
	 * 	Update Ip28221Filler 
	 *     with another Field from an offset and length  
	 *                         to  an offset and length         
	 *	@param value
	 */
   public void setIp28221Filler(Field source, int sourceIndex,int sourceLen, int targetIndex,int targetLen) {
       replace(source,sourceIndex,sourceLen,beginIp28221Filler+targetIndex,targetLen);
    
   }

	
	
	

		public static int getIp28221PaTableRestartFieldLength() {
			return IP_28221_PA_TABLE_RESTART_LENGTH;
		}

}
  
