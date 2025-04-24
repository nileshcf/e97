package com.cloudframe.app.bm80022.dto.serialize;

/**
*  The class WorkSerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-24 at 16:40. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;
import java.math.BigDecimal;

public class WorkSerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(WorkSerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int WORK_LENGTH = 16;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginGe1801Codcontrat;
            protected  int beginGe1801Ofigestora;
            protected  int beginGe1801Numcartera;
	
	/**
	* Constructor for WorkSerialized
	**/
    public WorkSerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in WorkSerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(WORK_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
             beginGe1801Codcontrat = getStartOffset() + 0;	// set offset for serialization
  
             beginGe1801Ofigestora = getStartOffset() + 8;	// set offset for serialization
  
  
  
             beginGe1801Numcartera = getStartOffset() + 11;	// set offset for serialization
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
	   /*  end of offset */
	}
     int localLitAbrirCounter = -1;
     public boolean isLitAbrirModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLitAbrirCounter != sharedCounter;
         localLitAbrirCounter = sharedCounter; return hasModified;
     }

   protected char[] checkLitAbrirConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
     int localLitWriteCounter = -1;
     public boolean isLitWriteModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLitWriteCounter != sharedCounter;
         localLitWriteCounter = sharedCounter; return hasModified;
     }

   protected char[] checkLitWriteConstraints(char[] value) {
   			return super.checkConstraints(value , 5 ,false, false);
   }
     int localLitCerrarCounter = -1;
     public boolean isLitCerrarModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLitCerrarCounter != sharedCounter;
         localLitCerrarCounter = sharedCounter; return hasModified;
     }

   protected char[] checkLitCerrarConstraints(char[] value) {
   			return super.checkConstraints(value , 6 ,false, false);
   }
     int localLitGe0001wCounter = -1;
     public boolean isLitGe0001wModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLitGe0001wCounter != sharedCounter;
         localLitGe0001wCounter = sharedCounter; return hasModified;
     }

   protected char[] checkLitGe0001wConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localLitProgramaCounter = -1;
     public boolean isLitProgramaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localLitProgramaCounter != sharedCounter;
         localLitProgramaCounter = sharedCounter; return hasModified;
     }

   protected char[] checkLitProgramaConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localAccesoCounter = -1;
     public boolean isAccesoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAccesoCounter != sharedCounter;
         localAccesoCounter = sharedCounter; return hasModified;
     }

   protected char[] checkAccesoConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localFicheroCounter = -1;
     public boolean isFicheroModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFicheroCounter != sharedCounter;
         localFicheroCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFicheroConstraints(char[] value) {
   			return super.checkConstraints(value , 7 ,false, false);
   }
     int localFileStatusCounter = -1;
     public boolean isFileStatusModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFileStatusCounter != sharedCounter;
         localFileStatusCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFileStatusConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localFsGe0001wCounter = -1;
     public boolean isFsGe0001wModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localFsGe0001wCounter != sharedCounter;
         localFsGe0001wCounter = sharedCounter; return hasModified;
     }

   protected char[] checkFsGe0001wConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
         int localSqlcode_WsCounter = -1;
         public boolean isSqlcode_WsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localSqlcode_WsCounter != sharedCounter;
            localSqlcode_WsCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkSqlcode_WsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localWkErrorDb2Counter = -1;
     public boolean isWkErrorDb2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localWkErrorDb2Counter != sharedCounter;
         localWkErrorDb2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkWkErrorDb2Constraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localSwFinCurGe18Counter = -1;
     public boolean isSwFinCurGe18Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSwFinCurGe18Counter != sharedCounter;
         localSwFinCurGe18Counter = sharedCounter; return hasModified;
     }

   protected char[] checkSwFinCurGe18Constraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSwInfoSalidaCounter = -1;
     public boolean isSwInfoSalidaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSwInfoSalidaCounter != sharedCounter;
         localSwInfoSalidaCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSwInfoSalidaConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
     int localSwFinCursorRowsetCounter = -1;
     public boolean isSwFinCursorRowsetModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localSwFinCursorRowsetCounter != sharedCounter;
         localSwFinCursorRowsetCounter = sharedCounter; return hasModified;
     }

   protected char[] checkSwFinCursorRowsetConstraints(char[] value) {
   			return super.checkConstraints(value , 1 ,false, false);
   }
         int localPosRowCounter = -1;
         public boolean isPosRowModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localPosRowCounter != sharedCounter;
            localPosRowCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkPosRowMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localRegsRecupRowsetCounter = -1;
         public boolean isRegsRecupRowsetModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localRegsRecupRowsetCounter != sharedCounter;
            localRegsRecupRowsetCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkRegsRecupRowsetMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localAbendLinea1Counter = -1;
     public boolean isAbendLinea1Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendLinea1Counter != sharedCounter;
         localAbendLinea1Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendLinea1Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localAbendLinea2Counter = -1;
     public boolean isAbendLinea2Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendLinea2Counter != sharedCounter;
         localAbendLinea2Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendLinea2Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localAbendLinea3Counter = -1;
     public boolean isAbendLinea3Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendLinea3Counter != sharedCounter;
         localAbendLinea3Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendLinea3Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localAbendLinea5Counter = -1;
     public boolean isAbendLinea5Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendLinea5Counter != sharedCounter;
         localAbendLinea5Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendLinea5Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localAbendLinea8Counter = -1;
     public boolean isAbendLinea8Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendLinea8Counter != sharedCounter;
         localAbendLinea8Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendLinea8Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localAbendLinea9Counter = -1;
     public boolean isAbendLinea9Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendLinea9Counter != sharedCounter;
         localAbendLinea9Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendLinea9Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localAbendLinea10Counter = -1;
     public boolean isAbendLinea10Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendLinea10Counter != sharedCounter;
         localAbendLinea10Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendLinea10Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localAbendLinea11Counter = -1;
     public boolean isAbendLinea11Modified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localAbendLinea11Counter != sharedCounter;
         localAbendLinea11Counter = sharedCounter; return hasModified;
     }

   protected char[] checkAbendLinea11Constraints(char[] value) {
   			return super.checkConstraints(value , 80 ,false, false);
   }
     int localGe1801CodentidCounter = -1;
     public boolean isGe1801CodentidModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe1801CodentidCounter != sharedCounter;
         localGe1801CodentidCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGe1801CodentidConstraints(char[] value) {
   			return super.checkConstraints(value , 2 ,false, false);
   }
     int localGe1801TipproductCounter = -1;
     public boolean isGe1801TipproductModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe1801TipproductCounter != sharedCounter;
         localGe1801TipproductCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGe1801TipproductConstraints(char[] value) {
   			return super.checkConstraints(value , 3 ,false, false);
   }
        int localGe1801CodcontratCounter = -1;
        public boolean isGe1801CodcontratModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localGe1801CodcontratCounter != sharedCounter;
           localGe1801CodcontratCounter = sharedCounter; return hasModified; 
        }
	    public boolean ge1801CodcontratIsNumeric() {
	      return decimalIsNumeric(beginGe1801Codcontrat,GE_1801_CODCONTRAT_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int GE_1801_CODCONTRAT_LEN = 8;
  	/**
	 * 	serializeGe1801Codcontrat
	 */
	protected void serializeGe1801Codcontrat(long ge1801Codcontrat) {
		   putDecimal(beginGe1801Codcontrat,ge1801Codcontrat,GE_1801_CODCONTRAT_LEN,true);
   }
   

   protected long checkGe1801CodcontratMaxLimit(long number) {
        return checkMaxLimit(number , MAX_1P /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshGe1801Codcontrat is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public long refreshGe1801Codcontrat() throws CFException {	
   	try { 
		 return (getLongDecimal(beginGe1801Codcontrat,GE_1801_CODCONTRAT_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ge1801Codcontrat", beginGe1801Codcontrat,GE_1801_CODCONTRAT_LEN);
     }
   	}
        int localGe1801OfigestoraCounter = -1;
        public boolean isGe1801OfigestoraModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localGe1801OfigestoraCounter != sharedCounter;
           localGe1801OfigestoraCounter = sharedCounter; return hasModified; 
        }
	    public boolean ge1801OfigestoraIsNumeric() {
	      return decimalIsNumeric(beginGe1801Ofigestora,GE_1801_OFIGESTORA_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int GE_1801_OFIGESTORA_LEN = 3;
  	/**
	 * 	serializeGe1801Ofigestora
	 */
	protected void serializeGe1801Ofigestora(short ge1801Ofigestora) {
		   putDecimal(beginGe1801Ofigestora,ge1801Ofigestora,GE_1801_OFIGESTORA_LEN,true);
   }
   

   protected short checkGe1801OfigestoraMaxLimit(long number) {
	   return (short)checkMaxLimit(number , MAX_10K /*limit*/  , true /*isSigned*/);
   }

     /**
	 *	refreshGe1801Ofigestora is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshGe1801Ofigestora() throws CFException {	
   	try { 
		 return (getShortDecimal(beginGe1801Ofigestora,GE_1801_OFIGESTORA_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ge1801Ofigestora", beginGe1801Ofigestora,GE_1801_OFIGESTORA_LEN);
     }
   	}
     int localGe1801IdepsigCounter = -1;
     public boolean isGe1801IdepsigModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe1801IdepsigCounter != sharedCounter;
         localGe1801IdepsigCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGe1801IdepsigConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
         int localGe1801NumpersonaCounter = -1;
         public boolean isGe1801NumpersonaModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localGe1801NumpersonaCounter != sharedCounter;
            localGe1801NumpersonaCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkGe1801NumpersonaMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
        int localGe1801NumcarteraCounter = -1;
        public boolean isGe1801NumcarteraModified() {
           int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
           boolean hasModified = localGe1801NumcarteraCounter != sharedCounter;
           localGe1801NumcarteraCounter = sharedCounter; return hasModified; 
        }
	    public boolean ge1801NumcarteraIsNumeric() {
	      return decimalIsNumeric(beginGe1801Numcartera,GE_1801_NUMCARTERA_LEN);// check Packed Decimal field to see if it contains valid Number
	    } 
   protected static final int GE_1801_NUMCARTERA_LEN = 5;
  	/**
	 * 	serializeGe1801Numcartera
	 */
	protected void serializeGe1801Numcartera(int ge1801Numcartera) {
		   putDecimal(beginGe1801Numcartera,ge1801Numcartera,GE_1801_NUMCARTERA_LEN,true);
   }
   

   protected int checkGe1801NumcarteraMaxLimit(long number) {
	   return (int)checkMaxLimit(number , MAX_100M /*limit*/ , true/*isSigned*/);
   }

     /**
	 *	refreshGe1801Numcartera is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public int refreshGe1801Numcartera() throws CFException {	
   	try { 
		 return (getIntDecimal(beginGe1801Numcartera,GE_1801_NUMCARTERA_LEN));
	 } catch(Exception ex) {
    	throw getSoc7ABend("ge1801Numcartera", beginGe1801Numcartera,GE_1801_NUMCARTERA_LEN);
     }
   	}
     int localGe1801CodcarteraCounter = -1;
     public boolean isGe1801CodcarteraModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe1801CodcarteraCounter != sharedCounter;
         localGe1801CodcarteraCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGe1801CodcarteraConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localGe1801FechaaltaCounter = -1;
     public boolean isGe1801FechaaltaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe1801FechaaltaCounter != sharedCounter;
         localGe1801FechaaltaCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGe1801FechaaltaConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localGe1801FechabajaCounter = -1;
     public boolean isGe1801FechabajaModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe1801FechabajaCounter != sharedCounter;
         localGe1801FechabajaCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGe1801FechabajaConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
     int localGe1801CodnodoCounter = -1;
     public boolean isGe1801CodnodoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe1801CodnodoCounter != sharedCounter;
         localGe1801CodnodoCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGe1801CodnodoConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localGe1801ResambitoCounter = -1;
     public boolean isGe1801ResambitoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe1801ResambitoCounter != sharedCounter;
         localGe1801ResambitoCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGe1801ResambitoConstraints(char[] value) {
   			return super.checkConstraints(value , 12 ,false, false);
   }
         int localGe1801NumresambCounter = -1;
         public boolean isGe1801NumresambModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localGe1801NumresambCounter != sharedCounter;
            localGe1801NumresambCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkGe1801NumresambMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localGe1801NumpresambCounter = -1;
         public boolean isGe1801NumpresambModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localGe1801NumpresambCounter != sharedCounter;
            localGe1801NumpresambCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkGe1801NumpresambMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localGe1801CengescaptCounter = -1;
     public boolean isGe1801CengescaptModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe1801CengescaptCounter != sharedCounter;
         localGe1801CengescaptCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGe1801CengescaptConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
         int localGe1801NumgescapCounter = -1;
         public boolean isGe1801NumgescapModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localGe1801NumgescapCounter != sharedCounter;
            localGe1801NumgescapCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkGe1801NumgescapMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localGe1801NumpgescapCounter = -1;
         public boolean isGe1801NumpgescapModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localGe1801NumpgescapCounter != sharedCounter;
            localGe1801NumpgescapCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkGe1801NumpgescapMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
         int localGe1801NumpesprieCounter = -1;
         public boolean isGe1801NumpesprieModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localGe1801NumpesprieCounter != sharedCounter;
            localGe1801NumpesprieCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkGe1801NumpesprieMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }
     int localGe1801CodcarrieCounter = -1;
     public boolean isGe1801CodcarrieModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe1801CodcarrieCounter != sharedCounter;
         localGe1801CodcarrieCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGe1801CodcarrieConstraints(char[] value) {
   			return super.checkConstraints(value , 8 ,false, false);
   }
     int localGe1801FecciecursoCounter = -1;
     public boolean isGe1801FecciecursoModified() {
         int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
         boolean hasModified = localGe1801FecciecursoCounter != sharedCounter;
         localGe1801FecciecursoCounter = sharedCounter; return hasModified;
     }

   protected char[] checkGe1801FecciecursoConstraints(char[] value) {
   			return super.checkConstraints(value , 10 ,false, false);
   }
         int localDsnnrowsCounter = -1;
         public boolean isDsnnrowsModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localDsnnrowsCounter != sharedCounter;
            localDsnnrowsCounter = sharedCounter; return hasModified; 
         }
       
      
   protected int checkDsnnrowsMaxLimit(long number) {
	   return (int)checkMaxLimit(number, true/*isSigned*/,4/*dataLen*/);
   }




}
  
