package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup83Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-29 at 08:31. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup83Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup83Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_83_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2543S;
            protected  int beginIp65504P2543L;
            protected  int beginIp65504P2544S;
            protected  int beginIp65504P2544L;
            protected  int beginIp65504P2545S;
            protected  int beginIp65504P2545L;
            protected  int beginIp65504P2546S;
            protected  int beginIp65504P2546L;
            protected  int beginIp65504P2547S;
            protected  int beginIp65504P2547L;
            protected  int beginIp65504P2548S;
            protected  int beginIp65504P2548L;
            protected  int beginIp65504P2549S;
            protected  int beginIp65504P2549L;
            protected  int beginIp65504P2550S;
            protected  int beginIp65504P2550L;
            protected  int beginIp65504P2551S;
            protected  int beginIp65504P2551L;
            protected  int beginIp65504P2552S;
            protected  int beginIp65504P2552L;
            protected  int beginIp65504P2553S;
            protected  int beginIp65504P2553L;
            protected  int beginIp65504P2554S;
            protected  int beginIp65504P2554L;
            protected  int beginIp65504P2555S;
            protected  int beginIp65504P2555L;
            protected  int beginIp65504P2556S;
            protected  int beginIp65504P2556L;
            protected  int beginIp65504P2557S;
            protected  int beginIp65504P2557L;
            protected  int beginIp65504P2558S;
            protected  int beginIp65504P2558L;
            protected  int beginIp65504P2559S;
            protected  int beginIp65504P2559L;
            protected  int beginIp65504P2560S;
            protected  int beginIp65504P2560L;
            protected  int beginIp65504P2561S;
            protected  int beginIp65504P2561L;
            protected  int beginIp65504P2562S;
            protected  int beginIp65504P2562L;
            protected  int beginIp65504P2563S;
            protected  int beginIp65504P2563L;
            protected  int beginIp65504P2564S;
            protected  int beginIp65504P2564L;
            protected  int beginIp65504P2565S;
            protected  int beginIp65504P2565L;
            protected  int beginIp65504P2566S;
            protected  int beginIp65504P2566L;
            protected  int beginIp65504P2567S;
            protected  int beginIp65504P2567L;
            protected  int beginIp65504P2568S;
            protected  int beginIp65504P2568L;
            protected  int beginIp65504P2569S;
            protected  int beginIp65504P2569L;
            protected  int beginIp65504P2570S;
            protected  int beginIp65504P2570L;
            protected  int beginIp65504P2571S;
            protected  int beginIp65504P2571L;
            protected  int beginIp65504P2572S;
            protected  int beginIp65504P2572L;
            protected  int beginIp65504P2573S;
            protected  int beginIp65504P2573L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup83Serialized
	**/
    public Ip65504PdsNamesLargeGroup83Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup83Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup83Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup83Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,20332); // serialize this field at offset 20332 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup83Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 20332 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup83Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_83_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2543S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2543L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2544S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2544L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2545S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2545L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2546S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2546L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2547S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2547L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2548S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2548L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2549S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2549L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2550S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2550L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2551S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2551L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2552S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2552L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2553S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2553L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2554S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2554L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2555S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2555L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2556S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2556L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2557S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2557L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2558S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2558L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2559S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2559L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2560S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2560L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2561S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2561L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2562S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2562L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2563S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2563L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2564S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2564L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2565S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2565L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2566S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2566L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2567S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2567L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2568S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2568L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2569S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2569L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2570S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2570L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2571S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2571L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2572S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2572L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2573S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2573L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2543SCounter = -1;
         public boolean isIp65504P2543SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2543SCounter != sharedCounter;
            localIp65504P2543SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2543_S_LEN = 2;
  	/**
	 * serializeIp65504P2543S
	 */
	protected void serializeIp65504P2543S(short ip65504P2543S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2543S,IP_65504_P_2543_S_LEN)
                  ,beginIp65504P2543S
                  ,IP_65504_P_2543_S_LEN
                 );
            localIp65504P2543SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2543SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2543S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2543S() {	 
			return (getShort(beginIp65504P2543S));
   	}
         int localIp65504P2543LCounter = -1;
         public boolean isIp65504P2543LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2543LCounter != sharedCounter;
            localIp65504P2543LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2543_L_LEN = 2;
  	/**
	 * serializeIp65504P2543L
	 */
	protected void serializeIp65504P2543L(short ip65504P2543L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2543L,IP_65504_P_2543_L_LEN)
                  ,beginIp65504P2543L
                  ,IP_65504_P_2543_L_LEN
                 );
            localIp65504P2543LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2543LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2543L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2543L() {	 
			return (getShort(beginIp65504P2543L));
   	}
         int localIp65504P2544SCounter = -1;
         public boolean isIp65504P2544SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2544SCounter != sharedCounter;
            localIp65504P2544SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2544_S_LEN = 2;
  	/**
	 * serializeIp65504P2544S
	 */
	protected void serializeIp65504P2544S(short ip65504P2544S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2544S,IP_65504_P_2544_S_LEN)
                  ,beginIp65504P2544S
                  ,IP_65504_P_2544_S_LEN
                 );
            localIp65504P2544SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2544SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2544S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2544S() {	 
			return (getShort(beginIp65504P2544S));
   	}
         int localIp65504P2544LCounter = -1;
         public boolean isIp65504P2544LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2544LCounter != sharedCounter;
            localIp65504P2544LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2544_L_LEN = 2;
  	/**
	 * serializeIp65504P2544L
	 */
	protected void serializeIp65504P2544L(short ip65504P2544L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2544L,IP_65504_P_2544_L_LEN)
                  ,beginIp65504P2544L
                  ,IP_65504_P_2544_L_LEN
                 );
            localIp65504P2544LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2544LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2544L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2544L() {	 
			return (getShort(beginIp65504P2544L));
   	}
         int localIp65504P2545SCounter = -1;
         public boolean isIp65504P2545SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2545SCounter != sharedCounter;
            localIp65504P2545SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2545_S_LEN = 2;
  	/**
	 * serializeIp65504P2545S
	 */
	protected void serializeIp65504P2545S(short ip65504P2545S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2545S,IP_65504_P_2545_S_LEN)
                  ,beginIp65504P2545S
                  ,IP_65504_P_2545_S_LEN
                 );
            localIp65504P2545SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2545SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2545S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2545S() {	 
			return (getShort(beginIp65504P2545S));
   	}
         int localIp65504P2545LCounter = -1;
         public boolean isIp65504P2545LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2545LCounter != sharedCounter;
            localIp65504P2545LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2545_L_LEN = 2;
  	/**
	 * serializeIp65504P2545L
	 */
	protected void serializeIp65504P2545L(short ip65504P2545L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2545L,IP_65504_P_2545_L_LEN)
                  ,beginIp65504P2545L
                  ,IP_65504_P_2545_L_LEN
                 );
            localIp65504P2545LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2545LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2545L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2545L() {	 
			return (getShort(beginIp65504P2545L));
   	}
         int localIp65504P2546SCounter = -1;
         public boolean isIp65504P2546SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2546SCounter != sharedCounter;
            localIp65504P2546SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2546_S_LEN = 2;
  	/**
	 * serializeIp65504P2546S
	 */
	protected void serializeIp65504P2546S(short ip65504P2546S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2546S,IP_65504_P_2546_S_LEN)
                  ,beginIp65504P2546S
                  ,IP_65504_P_2546_S_LEN
                 );
            localIp65504P2546SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2546SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2546S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2546S() {	 
			return (getShort(beginIp65504P2546S));
   	}
         int localIp65504P2546LCounter = -1;
         public boolean isIp65504P2546LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2546LCounter != sharedCounter;
            localIp65504P2546LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2546_L_LEN = 2;
  	/**
	 * serializeIp65504P2546L
	 */
	protected void serializeIp65504P2546L(short ip65504P2546L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2546L,IP_65504_P_2546_L_LEN)
                  ,beginIp65504P2546L
                  ,IP_65504_P_2546_L_LEN
                 );
            localIp65504P2546LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2546LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2546L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2546L() {	 
			return (getShort(beginIp65504P2546L));
   	}
         int localIp65504P2547SCounter = -1;
         public boolean isIp65504P2547SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2547SCounter != sharedCounter;
            localIp65504P2547SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2547_S_LEN = 2;
  	/**
	 * serializeIp65504P2547S
	 */
	protected void serializeIp65504P2547S(short ip65504P2547S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2547S,IP_65504_P_2547_S_LEN)
                  ,beginIp65504P2547S
                  ,IP_65504_P_2547_S_LEN
                 );
            localIp65504P2547SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2547SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2547S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2547S() {	 
			return (getShort(beginIp65504P2547S));
   	}
         int localIp65504P2547LCounter = -1;
         public boolean isIp65504P2547LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2547LCounter != sharedCounter;
            localIp65504P2547LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2547_L_LEN = 2;
  	/**
	 * serializeIp65504P2547L
	 */
	protected void serializeIp65504P2547L(short ip65504P2547L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2547L,IP_65504_P_2547_L_LEN)
                  ,beginIp65504P2547L
                  ,IP_65504_P_2547_L_LEN
                 );
            localIp65504P2547LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2547LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2547L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2547L() {	 
			return (getShort(beginIp65504P2547L));
   	}
         int localIp65504P2548SCounter = -1;
         public boolean isIp65504P2548SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2548SCounter != sharedCounter;
            localIp65504P2548SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2548_S_LEN = 2;
  	/**
	 * serializeIp65504P2548S
	 */
	protected void serializeIp65504P2548S(short ip65504P2548S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2548S,IP_65504_P_2548_S_LEN)
                  ,beginIp65504P2548S
                  ,IP_65504_P_2548_S_LEN
                 );
            localIp65504P2548SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2548SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2548S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2548S() {	 
			return (getShort(beginIp65504P2548S));
   	}
         int localIp65504P2548LCounter = -1;
         public boolean isIp65504P2548LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2548LCounter != sharedCounter;
            localIp65504P2548LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2548_L_LEN = 2;
  	/**
	 * serializeIp65504P2548L
	 */
	protected void serializeIp65504P2548L(short ip65504P2548L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2548L,IP_65504_P_2548_L_LEN)
                  ,beginIp65504P2548L
                  ,IP_65504_P_2548_L_LEN
                 );
            localIp65504P2548LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2548LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2548L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2548L() {	 
			return (getShort(beginIp65504P2548L));
   	}
         int localIp65504P2549SCounter = -1;
         public boolean isIp65504P2549SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2549SCounter != sharedCounter;
            localIp65504P2549SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2549_S_LEN = 2;
  	/**
	 * serializeIp65504P2549S
	 */
	protected void serializeIp65504P2549S(short ip65504P2549S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2549S,IP_65504_P_2549_S_LEN)
                  ,beginIp65504P2549S
                  ,IP_65504_P_2549_S_LEN
                 );
            localIp65504P2549SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2549SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2549S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2549S() {	 
			return (getShort(beginIp65504P2549S));
   	}
         int localIp65504P2549LCounter = -1;
         public boolean isIp65504P2549LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2549LCounter != sharedCounter;
            localIp65504P2549LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2549_L_LEN = 2;
  	/**
	 * serializeIp65504P2549L
	 */
	protected void serializeIp65504P2549L(short ip65504P2549L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2549L,IP_65504_P_2549_L_LEN)
                  ,beginIp65504P2549L
                  ,IP_65504_P_2549_L_LEN
                 );
            localIp65504P2549LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2549LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2549L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2549L() {	 
			return (getShort(beginIp65504P2549L));
   	}
         int localIp65504P2550SCounter = -1;
         public boolean isIp65504P2550SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2550SCounter != sharedCounter;
            localIp65504P2550SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2550_S_LEN = 2;
  	/**
	 * serializeIp65504P2550S
	 */
	protected void serializeIp65504P2550S(short ip65504P2550S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2550S,IP_65504_P_2550_S_LEN)
                  ,beginIp65504P2550S
                  ,IP_65504_P_2550_S_LEN
                 );
            localIp65504P2550SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2550SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2550S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2550S() {	 
			return (getShort(beginIp65504P2550S));
   	}
         int localIp65504P2550LCounter = -1;
         public boolean isIp65504P2550LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2550LCounter != sharedCounter;
            localIp65504P2550LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2550_L_LEN = 2;
  	/**
	 * serializeIp65504P2550L
	 */
	protected void serializeIp65504P2550L(short ip65504P2550L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2550L,IP_65504_P_2550_L_LEN)
                  ,beginIp65504P2550L
                  ,IP_65504_P_2550_L_LEN
                 );
            localIp65504P2550LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2550LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2550L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2550L() {	 
			return (getShort(beginIp65504P2550L));
   	}
         int localIp65504P2551SCounter = -1;
         public boolean isIp65504P2551SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2551SCounter != sharedCounter;
            localIp65504P2551SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2551_S_LEN = 2;
  	/**
	 * serializeIp65504P2551S
	 */
	protected void serializeIp65504P2551S(short ip65504P2551S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2551S,IP_65504_P_2551_S_LEN)
                  ,beginIp65504P2551S
                  ,IP_65504_P_2551_S_LEN
                 );
            localIp65504P2551SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2551SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2551S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2551S() {	 
			return (getShort(beginIp65504P2551S));
   	}
         int localIp65504P2551LCounter = -1;
         public boolean isIp65504P2551LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2551LCounter != sharedCounter;
            localIp65504P2551LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2551_L_LEN = 2;
  	/**
	 * serializeIp65504P2551L
	 */
	protected void serializeIp65504P2551L(short ip65504P2551L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2551L,IP_65504_P_2551_L_LEN)
                  ,beginIp65504P2551L
                  ,IP_65504_P_2551_L_LEN
                 );
            localIp65504P2551LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2551LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2551L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2551L() {	 
			return (getShort(beginIp65504P2551L));
   	}
         int localIp65504P2552SCounter = -1;
         public boolean isIp65504P2552SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2552SCounter != sharedCounter;
            localIp65504P2552SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2552_S_LEN = 2;
  	/**
	 * serializeIp65504P2552S
	 */
	protected void serializeIp65504P2552S(short ip65504P2552S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2552S,IP_65504_P_2552_S_LEN)
                  ,beginIp65504P2552S
                  ,IP_65504_P_2552_S_LEN
                 );
            localIp65504P2552SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2552SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2552S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2552S() {	 
			return (getShort(beginIp65504P2552S));
   	}
         int localIp65504P2552LCounter = -1;
         public boolean isIp65504P2552LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2552LCounter != sharedCounter;
            localIp65504P2552LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2552_L_LEN = 2;
  	/**
	 * serializeIp65504P2552L
	 */
	protected void serializeIp65504P2552L(short ip65504P2552L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2552L,IP_65504_P_2552_L_LEN)
                  ,beginIp65504P2552L
                  ,IP_65504_P_2552_L_LEN
                 );
            localIp65504P2552LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2552LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2552L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2552L() {	 
			return (getShort(beginIp65504P2552L));
   	}
         int localIp65504P2553SCounter = -1;
         public boolean isIp65504P2553SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2553SCounter != sharedCounter;
            localIp65504P2553SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2553_S_LEN = 2;
  	/**
	 * serializeIp65504P2553S
	 */
	protected void serializeIp65504P2553S(short ip65504P2553S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2553S,IP_65504_P_2553_S_LEN)
                  ,beginIp65504P2553S
                  ,IP_65504_P_2553_S_LEN
                 );
            localIp65504P2553SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2553SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2553S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2553S() {	 
			return (getShort(beginIp65504P2553S));
   	}
         int localIp65504P2553LCounter = -1;
         public boolean isIp65504P2553LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2553LCounter != sharedCounter;
            localIp65504P2553LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2553_L_LEN = 2;
  	/**
	 * serializeIp65504P2553L
	 */
	protected void serializeIp65504P2553L(short ip65504P2553L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2553L,IP_65504_P_2553_L_LEN)
                  ,beginIp65504P2553L
                  ,IP_65504_P_2553_L_LEN
                 );
            localIp65504P2553LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2553LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2553L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2553L() {	 
			return (getShort(beginIp65504P2553L));
   	}
         int localIp65504P2554SCounter = -1;
         public boolean isIp65504P2554SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2554SCounter != sharedCounter;
            localIp65504P2554SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2554_S_LEN = 2;
  	/**
	 * serializeIp65504P2554S
	 */
	protected void serializeIp65504P2554S(short ip65504P2554S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2554S,IP_65504_P_2554_S_LEN)
                  ,beginIp65504P2554S
                  ,IP_65504_P_2554_S_LEN
                 );
            localIp65504P2554SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2554SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2554S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2554S() {	 
			return (getShort(beginIp65504P2554S));
   	}
         int localIp65504P2554LCounter = -1;
         public boolean isIp65504P2554LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2554LCounter != sharedCounter;
            localIp65504P2554LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2554_L_LEN = 2;
  	/**
	 * serializeIp65504P2554L
	 */
	protected void serializeIp65504P2554L(short ip65504P2554L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2554L,IP_65504_P_2554_L_LEN)
                  ,beginIp65504P2554L
                  ,IP_65504_P_2554_L_LEN
                 );
            localIp65504P2554LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2554LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2554L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2554L() {	 
			return (getShort(beginIp65504P2554L));
   	}
         int localIp65504P2555SCounter = -1;
         public boolean isIp65504P2555SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2555SCounter != sharedCounter;
            localIp65504P2555SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2555_S_LEN = 2;
  	/**
	 * serializeIp65504P2555S
	 */
	protected void serializeIp65504P2555S(short ip65504P2555S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2555S,IP_65504_P_2555_S_LEN)
                  ,beginIp65504P2555S
                  ,IP_65504_P_2555_S_LEN
                 );
            localIp65504P2555SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2555SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2555S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2555S() {	 
			return (getShort(beginIp65504P2555S));
   	}
         int localIp65504P2555LCounter = -1;
         public boolean isIp65504P2555LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2555LCounter != sharedCounter;
            localIp65504P2555LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2555_L_LEN = 2;
  	/**
	 * serializeIp65504P2555L
	 */
	protected void serializeIp65504P2555L(short ip65504P2555L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2555L,IP_65504_P_2555_L_LEN)
                  ,beginIp65504P2555L
                  ,IP_65504_P_2555_L_LEN
                 );
            localIp65504P2555LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2555LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2555L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2555L() {	 
			return (getShort(beginIp65504P2555L));
   	}
         int localIp65504P2556SCounter = -1;
         public boolean isIp65504P2556SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2556SCounter != sharedCounter;
            localIp65504P2556SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2556_S_LEN = 2;
  	/**
	 * serializeIp65504P2556S
	 */
	protected void serializeIp65504P2556S(short ip65504P2556S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2556S,IP_65504_P_2556_S_LEN)
                  ,beginIp65504P2556S
                  ,IP_65504_P_2556_S_LEN
                 );
            localIp65504P2556SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2556SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2556S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2556S() {	 
			return (getShort(beginIp65504P2556S));
   	}
         int localIp65504P2556LCounter = -1;
         public boolean isIp65504P2556LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2556LCounter != sharedCounter;
            localIp65504P2556LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2556_L_LEN = 2;
  	/**
	 * serializeIp65504P2556L
	 */
	protected void serializeIp65504P2556L(short ip65504P2556L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2556L,IP_65504_P_2556_L_LEN)
                  ,beginIp65504P2556L
                  ,IP_65504_P_2556_L_LEN
                 );
            localIp65504P2556LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2556LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2556L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2556L() {	 
			return (getShort(beginIp65504P2556L));
   	}
         int localIp65504P2557SCounter = -1;
         public boolean isIp65504P2557SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2557SCounter != sharedCounter;
            localIp65504P2557SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2557_S_LEN = 2;
  	/**
	 * serializeIp65504P2557S
	 */
	protected void serializeIp65504P2557S(short ip65504P2557S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2557S,IP_65504_P_2557_S_LEN)
                  ,beginIp65504P2557S
                  ,IP_65504_P_2557_S_LEN
                 );
            localIp65504P2557SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2557SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2557S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2557S() {	 
			return (getShort(beginIp65504P2557S));
   	}
         int localIp65504P2557LCounter = -1;
         public boolean isIp65504P2557LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2557LCounter != sharedCounter;
            localIp65504P2557LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2557_L_LEN = 2;
  	/**
	 * serializeIp65504P2557L
	 */
	protected void serializeIp65504P2557L(short ip65504P2557L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2557L,IP_65504_P_2557_L_LEN)
                  ,beginIp65504P2557L
                  ,IP_65504_P_2557_L_LEN
                 );
            localIp65504P2557LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2557LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2557L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2557L() {	 
			return (getShort(beginIp65504P2557L));
   	}
         int localIp65504P2558SCounter = -1;
         public boolean isIp65504P2558SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2558SCounter != sharedCounter;
            localIp65504P2558SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2558_S_LEN = 2;
  	/**
	 * serializeIp65504P2558S
	 */
	protected void serializeIp65504P2558S(short ip65504P2558S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2558S,IP_65504_P_2558_S_LEN)
                  ,beginIp65504P2558S
                  ,IP_65504_P_2558_S_LEN
                 );
            localIp65504P2558SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2558SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2558S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2558S() {	 
			return (getShort(beginIp65504P2558S));
   	}
         int localIp65504P2558LCounter = -1;
         public boolean isIp65504P2558LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2558LCounter != sharedCounter;
            localIp65504P2558LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2558_L_LEN = 2;
  	/**
	 * serializeIp65504P2558L
	 */
	protected void serializeIp65504P2558L(short ip65504P2558L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2558L,IP_65504_P_2558_L_LEN)
                  ,beginIp65504P2558L
                  ,IP_65504_P_2558_L_LEN
                 );
            localIp65504P2558LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2558LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2558L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2558L() {	 
			return (getShort(beginIp65504P2558L));
   	}
         int localIp65504P2559SCounter = -1;
         public boolean isIp65504P2559SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2559SCounter != sharedCounter;
            localIp65504P2559SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2559_S_LEN = 2;
  	/**
	 * serializeIp65504P2559S
	 */
	protected void serializeIp65504P2559S(short ip65504P2559S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2559S,IP_65504_P_2559_S_LEN)
                  ,beginIp65504P2559S
                  ,IP_65504_P_2559_S_LEN
                 );
            localIp65504P2559SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2559SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2559S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2559S() {	 
			return (getShort(beginIp65504P2559S));
   	}
         int localIp65504P2559LCounter = -1;
         public boolean isIp65504P2559LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2559LCounter != sharedCounter;
            localIp65504P2559LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2559_L_LEN = 2;
  	/**
	 * serializeIp65504P2559L
	 */
	protected void serializeIp65504P2559L(short ip65504P2559L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2559L,IP_65504_P_2559_L_LEN)
                  ,beginIp65504P2559L
                  ,IP_65504_P_2559_L_LEN
                 );
            localIp65504P2559LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2559LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2559L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2559L() {	 
			return (getShort(beginIp65504P2559L));
   	}
         int localIp65504P2560SCounter = -1;
         public boolean isIp65504P2560SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2560SCounter != sharedCounter;
            localIp65504P2560SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2560_S_LEN = 2;
  	/**
	 * serializeIp65504P2560S
	 */
	protected void serializeIp65504P2560S(short ip65504P2560S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2560S,IP_65504_P_2560_S_LEN)
                  ,beginIp65504P2560S
                  ,IP_65504_P_2560_S_LEN
                 );
            localIp65504P2560SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2560SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2560S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2560S() {	 
			return (getShort(beginIp65504P2560S));
   	}
         int localIp65504P2560LCounter = -1;
         public boolean isIp65504P2560LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2560LCounter != sharedCounter;
            localIp65504P2560LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2560_L_LEN = 2;
  	/**
	 * serializeIp65504P2560L
	 */
	protected void serializeIp65504P2560L(short ip65504P2560L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2560L,IP_65504_P_2560_L_LEN)
                  ,beginIp65504P2560L
                  ,IP_65504_P_2560_L_LEN
                 );
            localIp65504P2560LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2560LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2560L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2560L() {	 
			return (getShort(beginIp65504P2560L));
   	}
         int localIp65504P2561SCounter = -1;
         public boolean isIp65504P2561SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2561SCounter != sharedCounter;
            localIp65504P2561SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2561_S_LEN = 2;
  	/**
	 * serializeIp65504P2561S
	 */
	protected void serializeIp65504P2561S(short ip65504P2561S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2561S,IP_65504_P_2561_S_LEN)
                  ,beginIp65504P2561S
                  ,IP_65504_P_2561_S_LEN
                 );
            localIp65504P2561SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2561SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2561S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2561S() {	 
			return (getShort(beginIp65504P2561S));
   	}
         int localIp65504P2561LCounter = -1;
         public boolean isIp65504P2561LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2561LCounter != sharedCounter;
            localIp65504P2561LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2561_L_LEN = 2;
  	/**
	 * serializeIp65504P2561L
	 */
	protected void serializeIp65504P2561L(short ip65504P2561L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2561L,IP_65504_P_2561_L_LEN)
                  ,beginIp65504P2561L
                  ,IP_65504_P_2561_L_LEN
                 );
            localIp65504P2561LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2561LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2561L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2561L() {	 
			return (getShort(beginIp65504P2561L));
   	}
         int localIp65504P2562SCounter = -1;
         public boolean isIp65504P2562SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2562SCounter != sharedCounter;
            localIp65504P2562SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2562_S_LEN = 2;
  	/**
	 * serializeIp65504P2562S
	 */
	protected void serializeIp65504P2562S(short ip65504P2562S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2562S,IP_65504_P_2562_S_LEN)
                  ,beginIp65504P2562S
                  ,IP_65504_P_2562_S_LEN
                 );
            localIp65504P2562SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2562SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2562S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2562S() {	 
			return (getShort(beginIp65504P2562S));
   	}
         int localIp65504P2562LCounter = -1;
         public boolean isIp65504P2562LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2562LCounter != sharedCounter;
            localIp65504P2562LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2562_L_LEN = 2;
  	/**
	 * serializeIp65504P2562L
	 */
	protected void serializeIp65504P2562L(short ip65504P2562L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2562L,IP_65504_P_2562_L_LEN)
                  ,beginIp65504P2562L
                  ,IP_65504_P_2562_L_LEN
                 );
            localIp65504P2562LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2562LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2562L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2562L() {	 
			return (getShort(beginIp65504P2562L));
   	}
         int localIp65504P2563SCounter = -1;
         public boolean isIp65504P2563SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2563SCounter != sharedCounter;
            localIp65504P2563SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2563_S_LEN = 2;
  	/**
	 * serializeIp65504P2563S
	 */
	protected void serializeIp65504P2563S(short ip65504P2563S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2563S,IP_65504_P_2563_S_LEN)
                  ,beginIp65504P2563S
                  ,IP_65504_P_2563_S_LEN
                 );
            localIp65504P2563SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2563SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2563S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2563S() {	 
			return (getShort(beginIp65504P2563S));
   	}
         int localIp65504P2563LCounter = -1;
         public boolean isIp65504P2563LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2563LCounter != sharedCounter;
            localIp65504P2563LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2563_L_LEN = 2;
  	/**
	 * serializeIp65504P2563L
	 */
	protected void serializeIp65504P2563L(short ip65504P2563L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2563L,IP_65504_P_2563_L_LEN)
                  ,beginIp65504P2563L
                  ,IP_65504_P_2563_L_LEN
                 );
            localIp65504P2563LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2563LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2563L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2563L() {	 
			return (getShort(beginIp65504P2563L));
   	}
         int localIp65504P2564SCounter = -1;
         public boolean isIp65504P2564SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2564SCounter != sharedCounter;
            localIp65504P2564SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2564_S_LEN = 2;
  	/**
	 * serializeIp65504P2564S
	 */
	protected void serializeIp65504P2564S(short ip65504P2564S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2564S,IP_65504_P_2564_S_LEN)
                  ,beginIp65504P2564S
                  ,IP_65504_P_2564_S_LEN
                 );
            localIp65504P2564SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2564SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2564S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2564S() {	 
			return (getShort(beginIp65504P2564S));
   	}
         int localIp65504P2564LCounter = -1;
         public boolean isIp65504P2564LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2564LCounter != sharedCounter;
            localIp65504P2564LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2564_L_LEN = 2;
  	/**
	 * serializeIp65504P2564L
	 */
	protected void serializeIp65504P2564L(short ip65504P2564L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2564L,IP_65504_P_2564_L_LEN)
                  ,beginIp65504P2564L
                  ,IP_65504_P_2564_L_LEN
                 );
            localIp65504P2564LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2564LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2564L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2564L() {	 
			return (getShort(beginIp65504P2564L));
   	}
         int localIp65504P2565SCounter = -1;
         public boolean isIp65504P2565SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2565SCounter != sharedCounter;
            localIp65504P2565SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2565_S_LEN = 2;
  	/**
	 * serializeIp65504P2565S
	 */
	protected void serializeIp65504P2565S(short ip65504P2565S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2565S,IP_65504_P_2565_S_LEN)
                  ,beginIp65504P2565S
                  ,IP_65504_P_2565_S_LEN
                 );
            localIp65504P2565SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2565SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2565S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2565S() {	 
			return (getShort(beginIp65504P2565S));
   	}
         int localIp65504P2565LCounter = -1;
         public boolean isIp65504P2565LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2565LCounter != sharedCounter;
            localIp65504P2565LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2565_L_LEN = 2;
  	/**
	 * serializeIp65504P2565L
	 */
	protected void serializeIp65504P2565L(short ip65504P2565L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2565L,IP_65504_P_2565_L_LEN)
                  ,beginIp65504P2565L
                  ,IP_65504_P_2565_L_LEN
                 );
            localIp65504P2565LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2565LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2565L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2565L() {	 
			return (getShort(beginIp65504P2565L));
   	}
         int localIp65504P2566SCounter = -1;
         public boolean isIp65504P2566SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2566SCounter != sharedCounter;
            localIp65504P2566SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2566_S_LEN = 2;
  	/**
	 * serializeIp65504P2566S
	 */
	protected void serializeIp65504P2566S(short ip65504P2566S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2566S,IP_65504_P_2566_S_LEN)
                  ,beginIp65504P2566S
                  ,IP_65504_P_2566_S_LEN
                 );
            localIp65504P2566SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2566SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2566S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2566S() {	 
			return (getShort(beginIp65504P2566S));
   	}
         int localIp65504P2566LCounter = -1;
         public boolean isIp65504P2566LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2566LCounter != sharedCounter;
            localIp65504P2566LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2566_L_LEN = 2;
  	/**
	 * serializeIp65504P2566L
	 */
	protected void serializeIp65504P2566L(short ip65504P2566L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2566L,IP_65504_P_2566_L_LEN)
                  ,beginIp65504P2566L
                  ,IP_65504_P_2566_L_LEN
                 );
            localIp65504P2566LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2566LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2566L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2566L() {	 
			return (getShort(beginIp65504P2566L));
   	}
         int localIp65504P2567SCounter = -1;
         public boolean isIp65504P2567SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2567SCounter != sharedCounter;
            localIp65504P2567SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2567_S_LEN = 2;
  	/**
	 * serializeIp65504P2567S
	 */
	protected void serializeIp65504P2567S(short ip65504P2567S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2567S,IP_65504_P_2567_S_LEN)
                  ,beginIp65504P2567S
                  ,IP_65504_P_2567_S_LEN
                 );
            localIp65504P2567SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2567SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2567S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2567S() {	 
			return (getShort(beginIp65504P2567S));
   	}
         int localIp65504P2567LCounter = -1;
         public boolean isIp65504P2567LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2567LCounter != sharedCounter;
            localIp65504P2567LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2567_L_LEN = 2;
  	/**
	 * serializeIp65504P2567L
	 */
	protected void serializeIp65504P2567L(short ip65504P2567L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2567L,IP_65504_P_2567_L_LEN)
                  ,beginIp65504P2567L
                  ,IP_65504_P_2567_L_LEN
                 );
            localIp65504P2567LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2567LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2567L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2567L() {	 
			return (getShort(beginIp65504P2567L));
   	}
         int localIp65504P2568SCounter = -1;
         public boolean isIp65504P2568SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2568SCounter != sharedCounter;
            localIp65504P2568SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2568_S_LEN = 2;
  	/**
	 * serializeIp65504P2568S
	 */
	protected void serializeIp65504P2568S(short ip65504P2568S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2568S,IP_65504_P_2568_S_LEN)
                  ,beginIp65504P2568S
                  ,IP_65504_P_2568_S_LEN
                 );
            localIp65504P2568SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2568SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2568S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2568S() {	 
			return (getShort(beginIp65504P2568S));
   	}
         int localIp65504P2568LCounter = -1;
         public boolean isIp65504P2568LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2568LCounter != sharedCounter;
            localIp65504P2568LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2568_L_LEN = 2;
  	/**
	 * serializeIp65504P2568L
	 */
	protected void serializeIp65504P2568L(short ip65504P2568L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2568L,IP_65504_P_2568_L_LEN)
                  ,beginIp65504P2568L
                  ,IP_65504_P_2568_L_LEN
                 );
            localIp65504P2568LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2568LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2568L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2568L() {	 
			return (getShort(beginIp65504P2568L));
   	}
         int localIp65504P2569SCounter = -1;
         public boolean isIp65504P2569SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2569SCounter != sharedCounter;
            localIp65504P2569SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2569_S_LEN = 2;
  	/**
	 * serializeIp65504P2569S
	 */
	protected void serializeIp65504P2569S(short ip65504P2569S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2569S,IP_65504_P_2569_S_LEN)
                  ,beginIp65504P2569S
                  ,IP_65504_P_2569_S_LEN
                 );
            localIp65504P2569SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2569SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2569S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2569S() {	 
			return (getShort(beginIp65504P2569S));
   	}
         int localIp65504P2569LCounter = -1;
         public boolean isIp65504P2569LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2569LCounter != sharedCounter;
            localIp65504P2569LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2569_L_LEN = 2;
  	/**
	 * serializeIp65504P2569L
	 */
	protected void serializeIp65504P2569L(short ip65504P2569L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2569L,IP_65504_P_2569_L_LEN)
                  ,beginIp65504P2569L
                  ,IP_65504_P_2569_L_LEN
                 );
            localIp65504P2569LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2569LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2569L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2569L() {	 
			return (getShort(beginIp65504P2569L));
   	}
         int localIp65504P2570SCounter = -1;
         public boolean isIp65504P2570SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2570SCounter != sharedCounter;
            localIp65504P2570SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2570_S_LEN = 2;
  	/**
	 * serializeIp65504P2570S
	 */
	protected void serializeIp65504P2570S(short ip65504P2570S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2570S,IP_65504_P_2570_S_LEN)
                  ,beginIp65504P2570S
                  ,IP_65504_P_2570_S_LEN
                 );
            localIp65504P2570SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2570SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2570S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2570S() {	 
			return (getShort(beginIp65504P2570S));
   	}
         int localIp65504P2570LCounter = -1;
         public boolean isIp65504P2570LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2570LCounter != sharedCounter;
            localIp65504P2570LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2570_L_LEN = 2;
  	/**
	 * serializeIp65504P2570L
	 */
	protected void serializeIp65504P2570L(short ip65504P2570L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2570L,IP_65504_P_2570_L_LEN)
                  ,beginIp65504P2570L
                  ,IP_65504_P_2570_L_LEN
                 );
            localIp65504P2570LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2570LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2570L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2570L() {	 
			return (getShort(beginIp65504P2570L));
   	}
         int localIp65504P2571SCounter = -1;
         public boolean isIp65504P2571SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2571SCounter != sharedCounter;
            localIp65504P2571SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2571_S_LEN = 2;
  	/**
	 * serializeIp65504P2571S
	 */
	protected void serializeIp65504P2571S(short ip65504P2571S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2571S,IP_65504_P_2571_S_LEN)
                  ,beginIp65504P2571S
                  ,IP_65504_P_2571_S_LEN
                 );
            localIp65504P2571SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2571SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2571S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2571S() {	 
			return (getShort(beginIp65504P2571S));
   	}
         int localIp65504P2571LCounter = -1;
         public boolean isIp65504P2571LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2571LCounter != sharedCounter;
            localIp65504P2571LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2571_L_LEN = 2;
  	/**
	 * serializeIp65504P2571L
	 */
	protected void serializeIp65504P2571L(short ip65504P2571L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2571L,IP_65504_P_2571_L_LEN)
                  ,beginIp65504P2571L
                  ,IP_65504_P_2571_L_LEN
                 );
            localIp65504P2571LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2571LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2571L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2571L() {	 
			return (getShort(beginIp65504P2571L));
   	}
         int localIp65504P2572SCounter = -1;
         public boolean isIp65504P2572SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2572SCounter != sharedCounter;
            localIp65504P2572SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2572_S_LEN = 2;
  	/**
	 * serializeIp65504P2572S
	 */
	protected void serializeIp65504P2572S(short ip65504P2572S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2572S,IP_65504_P_2572_S_LEN)
                  ,beginIp65504P2572S
                  ,IP_65504_P_2572_S_LEN
                 );
            localIp65504P2572SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2572SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2572S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2572S() {	 
			return (getShort(beginIp65504P2572S));
   	}
         int localIp65504P2572LCounter = -1;
         public boolean isIp65504P2572LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2572LCounter != sharedCounter;
            localIp65504P2572LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2572_L_LEN = 2;
  	/**
	 * serializeIp65504P2572L
	 */
	protected void serializeIp65504P2572L(short ip65504P2572L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2572L,IP_65504_P_2572_L_LEN)
                  ,beginIp65504P2572L
                  ,IP_65504_P_2572_L_LEN
                 );
            localIp65504P2572LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2572LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2572L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2572L() {	 
			return (getShort(beginIp65504P2572L));
   	}
         int localIp65504P2573SCounter = -1;
         public boolean isIp65504P2573SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2573SCounter != sharedCounter;
            localIp65504P2573SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2573_S_LEN = 2;
  	/**
	 * serializeIp65504P2573S
	 */
	protected void serializeIp65504P2573S(short ip65504P2573S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2573S,IP_65504_P_2573_S_LEN)
                  ,beginIp65504P2573S
                  ,IP_65504_P_2573_S_LEN
                 );
            localIp65504P2573SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2573SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2573S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2573S() {	 
			return (getShort(beginIp65504P2573S));
   	}
         int localIp65504P2573LCounter = -1;
         public boolean isIp65504P2573LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2573LCounter != sharedCounter;
            localIp65504P2573LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2573_L_LEN = 2;
  	/**
	 * serializeIp65504P2573L
	 */
	protected void serializeIp65504P2573L(short ip65504P2573L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2573L,IP_65504_P_2573_L_LEN)
                  ,beginIp65504P2573L
                  ,IP_65504_P_2573_L_LEN
                 );
            localIp65504P2573LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2573LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2573L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2573L() {	 
			return (getShort(beginIp65504P2573L));
   	}




}
  
