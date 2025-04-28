package com.cloudframe.app.global.sharedvar.serialize;

/**
*  The class Ip65504PdsNamesLargeGroup94Serialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-28 at 07:58. using version 5.0.0.256
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ip65504PdsNamesLargeGroup94Serialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ip65504PdsNamesLargeGroup94Serialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int IP_65504_PDS_NAMES_LARGE_GROUP_94_LENGTH = 248;
   /*  offset of each of Child Fields when serialized as a String */
            protected  int beginIp65504P2884S;
            protected  int beginIp65504P2884L;
            protected  int beginIp65504P2885S;
            protected  int beginIp65504P2885L;
            protected  int beginIp65504P2886S;
            protected  int beginIp65504P2886L;
            protected  int beginIp65504P2887S;
            protected  int beginIp65504P2887L;
            protected  int beginIp65504P2888S;
            protected  int beginIp65504P2888L;
            protected  int beginIp65504P2889S;
            protected  int beginIp65504P2889L;
            protected  int beginIp65504P2890S;
            protected  int beginIp65504P2890L;
            protected  int beginIp65504P2891S;
            protected  int beginIp65504P2891L;
            protected  int beginIp65504P2892S;
            protected  int beginIp65504P2892L;
            protected  int beginIp65504P2893S;
            protected  int beginIp65504P2893L;
            protected  int beginIp65504P2894S;
            protected  int beginIp65504P2894L;
            protected  int beginIp65504P2895S;
            protected  int beginIp65504P2895L;
            protected  int beginIp65504P2896S;
            protected  int beginIp65504P2896L;
            protected  int beginIp65504P2897S;
            protected  int beginIp65504P2897L;
            protected  int beginIp65504P2898S;
            protected  int beginIp65504P2898L;
            protected  int beginIp65504P2899S;
            protected  int beginIp65504P2899L;
            protected  int beginIp65504P2900S;
            protected  int beginIp65504P2900L;
            protected  int beginIp65504P2901S;
            protected  int beginIp65504P2901L;
            protected  int beginIp65504P2902S;
            protected  int beginIp65504P2902L;
            protected  int beginIp65504P2903S;
            protected  int beginIp65504P2903L;
            protected  int beginIp65504P2904S;
            protected  int beginIp65504P2904L;
            protected  int beginIp65504P2905S;
            protected  int beginIp65504P2905L;
            protected  int beginIp65504P2906S;
            protected  int beginIp65504P2906L;
            protected  int beginIp65504P2907S;
            protected  int beginIp65504P2907L;
            protected  int beginIp65504P2908S;
            protected  int beginIp65504P2908L;
            protected  int beginIp65504P2909S;
            protected  int beginIp65504P2909L;
            protected  int beginIp65504P2910S;
            protected  int beginIp65504P2910L;
            protected  int beginIp65504P2911S;
            protected  int beginIp65504P2911L;
            protected  int beginIp65504P2912S;
            protected  int beginIp65504P2912L;
            protected  int beginIp65504P2913S;
            protected  int beginIp65504P2913L;
            protected  int beginIp65504P2914S;
            protected  int beginIp65504P2914L;
	
	/**
	* Constructor for Ip65504PdsNamesLargeGroup94Serialized
	**/
    public Ip65504PdsNamesLargeGroup94Serialized() {
	// TO-DO auto generated code
    }
 
	/**
	* Constructor for Ip65504PdsNamesLargeGroup94Serialized. sets the parent value to the parent
	* @param parent
	* @param begin
	**/
    public Ip65504PdsNamesLargeGroup94Serialized(Field parent,int begin) {
    	   setParent(parent,begin);
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup94Serialized to the parent
	* @param parent
	**/
    @Override
    public void setParent(Field parent) {
    	setParent(parent,23060); // serialize this field at offset 23060 by default 
    }
    
	/**
	* sets parent for this Ip65504PdsNamesLargeGroup94Serialized to the parent
	* and set the serialize offset to parameter begin
	* @param parent
	* @param begin - offset used when serializing this object to a String
	**/
    public void setParent(Field parent,int begin) {
    	super.setParent(parent);
    	init(begin); // serialize this field at offset 23060 by default
    }    
	/**
	* initializes the field in Ip65504PdsNamesLargeGroup94Serialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(IP_65504_PDS_NAMES_LARGE_GROUP_94_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
             beginIp65504P2884S = getStartOffset() + 4;	// set offset for serialization
  
             beginIp65504P2884L = getStartOffset() + 6;	// set offset for serialization
  
  
             beginIp65504P2885S = getStartOffset() + 12;	// set offset for serialization
  
             beginIp65504P2885L = getStartOffset() + 14;	// set offset for serialization
  
  
             beginIp65504P2886S = getStartOffset() + 20;	// set offset for serialization
  
             beginIp65504P2886L = getStartOffset() + 22;	// set offset for serialization
  
  
             beginIp65504P2887S = getStartOffset() + 28;	// set offset for serialization
  
             beginIp65504P2887L = getStartOffset() + 30;	// set offset for serialization
  
  
             beginIp65504P2888S = getStartOffset() + 36;	// set offset for serialization
  
             beginIp65504P2888L = getStartOffset() + 38;	// set offset for serialization
  
  
             beginIp65504P2889S = getStartOffset() + 44;	// set offset for serialization
  
             beginIp65504P2889L = getStartOffset() + 46;	// set offset for serialization
  
  
             beginIp65504P2890S = getStartOffset() + 52;	// set offset for serialization
  
             beginIp65504P2890L = getStartOffset() + 54;	// set offset for serialization
  
  
             beginIp65504P2891S = getStartOffset() + 60;	// set offset for serialization
  
             beginIp65504P2891L = getStartOffset() + 62;	// set offset for serialization
  
  
             beginIp65504P2892S = getStartOffset() + 68;	// set offset for serialization
  
             beginIp65504P2892L = getStartOffset() + 70;	// set offset for serialization
  
  
             beginIp65504P2893S = getStartOffset() + 76;	// set offset for serialization
  
             beginIp65504P2893L = getStartOffset() + 78;	// set offset for serialization
  
  
             beginIp65504P2894S = getStartOffset() + 84;	// set offset for serialization
  
             beginIp65504P2894L = getStartOffset() + 86;	// set offset for serialization
  
  
             beginIp65504P2895S = getStartOffset() + 92;	// set offset for serialization
  
             beginIp65504P2895L = getStartOffset() + 94;	// set offset for serialization
  
  
             beginIp65504P2896S = getStartOffset() + 100;	// set offset for serialization
  
             beginIp65504P2896L = getStartOffset() + 102;	// set offset for serialization
  
  
             beginIp65504P2897S = getStartOffset() + 108;	// set offset for serialization
  
             beginIp65504P2897L = getStartOffset() + 110;	// set offset for serialization
  
  
             beginIp65504P2898S = getStartOffset() + 116;	// set offset for serialization
  
             beginIp65504P2898L = getStartOffset() + 118;	// set offset for serialization
  
  
             beginIp65504P2899S = getStartOffset() + 124;	// set offset for serialization
  
             beginIp65504P2899L = getStartOffset() + 126;	// set offset for serialization
  
  
             beginIp65504P2900S = getStartOffset() + 132;	// set offset for serialization
  
             beginIp65504P2900L = getStartOffset() + 134;	// set offset for serialization
  
  
             beginIp65504P2901S = getStartOffset() + 140;	// set offset for serialization
  
             beginIp65504P2901L = getStartOffset() + 142;	// set offset for serialization
  
  
             beginIp65504P2902S = getStartOffset() + 148;	// set offset for serialization
  
             beginIp65504P2902L = getStartOffset() + 150;	// set offset for serialization
  
  
             beginIp65504P2903S = getStartOffset() + 156;	// set offset for serialization
  
             beginIp65504P2903L = getStartOffset() + 158;	// set offset for serialization
  
  
             beginIp65504P2904S = getStartOffset() + 164;	// set offset for serialization
  
             beginIp65504P2904L = getStartOffset() + 166;	// set offset for serialization
  
  
             beginIp65504P2905S = getStartOffset() + 172;	// set offset for serialization
  
             beginIp65504P2905L = getStartOffset() + 174;	// set offset for serialization
  
  
             beginIp65504P2906S = getStartOffset() + 180;	// set offset for serialization
  
             beginIp65504P2906L = getStartOffset() + 182;	// set offset for serialization
  
  
             beginIp65504P2907S = getStartOffset() + 188;	// set offset for serialization
  
             beginIp65504P2907L = getStartOffset() + 190;	// set offset for serialization
  
  
             beginIp65504P2908S = getStartOffset() + 196;	// set offset for serialization
  
             beginIp65504P2908L = getStartOffset() + 198;	// set offset for serialization
  
  
             beginIp65504P2909S = getStartOffset() + 204;	// set offset for serialization
  
             beginIp65504P2909L = getStartOffset() + 206;	// set offset for serialization
  
  
             beginIp65504P2910S = getStartOffset() + 212;	// set offset for serialization
  
             beginIp65504P2910L = getStartOffset() + 214;	// set offset for serialization
  
  
             beginIp65504P2911S = getStartOffset() + 220;	// set offset for serialization
  
             beginIp65504P2911L = getStartOffset() + 222;	// set offset for serialization
  
  
             beginIp65504P2912S = getStartOffset() + 228;	// set offset for serialization
  
             beginIp65504P2912L = getStartOffset() + 230;	// set offset for serialization
  
  
             beginIp65504P2913S = getStartOffset() + 236;	// set offset for serialization
  
             beginIp65504P2913L = getStartOffset() + 238;	// set offset for serialization
  
  
             beginIp65504P2914S = getStartOffset() + 244;	// set offset for serialization
  
             beginIp65504P2914L = getStartOffset() + 246;	// set offset for serialization
  
  
	   /*  end of offset */
	}
         int localIp65504P2884SCounter = -1;
         public boolean isIp65504P2884SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2884SCounter != sharedCounter;
            localIp65504P2884SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2884_S_LEN = 2;
  	/**
	 * serializeIp65504P2884S
	 */
	protected void serializeIp65504P2884S(short ip65504P2884S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2884S,IP_65504_P_2884_S_LEN)
                  ,beginIp65504P2884S
                  ,IP_65504_P_2884_S_LEN
                 );
            localIp65504P2884SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2884SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2884S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2884S() {	 
			return (getShort(beginIp65504P2884S));
   	}
         int localIp65504P2884LCounter = -1;
         public boolean isIp65504P2884LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2884LCounter != sharedCounter;
            localIp65504P2884LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2884_L_LEN = 2;
  	/**
	 * serializeIp65504P2884L
	 */
	protected void serializeIp65504P2884L(short ip65504P2884L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2884L,IP_65504_P_2884_L_LEN)
                  ,beginIp65504P2884L
                  ,IP_65504_P_2884_L_LEN
                 );
            localIp65504P2884LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2884LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2884L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2884L() {	 
			return (getShort(beginIp65504P2884L));
   	}
         int localIp65504P2885SCounter = -1;
         public boolean isIp65504P2885SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2885SCounter != sharedCounter;
            localIp65504P2885SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2885_S_LEN = 2;
  	/**
	 * serializeIp65504P2885S
	 */
	protected void serializeIp65504P2885S(short ip65504P2885S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2885S,IP_65504_P_2885_S_LEN)
                  ,beginIp65504P2885S
                  ,IP_65504_P_2885_S_LEN
                 );
            localIp65504P2885SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2885SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2885S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2885S() {	 
			return (getShort(beginIp65504P2885S));
   	}
         int localIp65504P2885LCounter = -1;
         public boolean isIp65504P2885LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2885LCounter != sharedCounter;
            localIp65504P2885LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2885_L_LEN = 2;
  	/**
	 * serializeIp65504P2885L
	 */
	protected void serializeIp65504P2885L(short ip65504P2885L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2885L,IP_65504_P_2885_L_LEN)
                  ,beginIp65504P2885L
                  ,IP_65504_P_2885_L_LEN
                 );
            localIp65504P2885LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2885LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2885L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2885L() {	 
			return (getShort(beginIp65504P2885L));
   	}
         int localIp65504P2886SCounter = -1;
         public boolean isIp65504P2886SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2886SCounter != sharedCounter;
            localIp65504P2886SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2886_S_LEN = 2;
  	/**
	 * serializeIp65504P2886S
	 */
	protected void serializeIp65504P2886S(short ip65504P2886S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2886S,IP_65504_P_2886_S_LEN)
                  ,beginIp65504P2886S
                  ,IP_65504_P_2886_S_LEN
                 );
            localIp65504P2886SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2886SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2886S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2886S() {	 
			return (getShort(beginIp65504P2886S));
   	}
         int localIp65504P2886LCounter = -1;
         public boolean isIp65504P2886LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2886LCounter != sharedCounter;
            localIp65504P2886LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2886_L_LEN = 2;
  	/**
	 * serializeIp65504P2886L
	 */
	protected void serializeIp65504P2886L(short ip65504P2886L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2886L,IP_65504_P_2886_L_LEN)
                  ,beginIp65504P2886L
                  ,IP_65504_P_2886_L_LEN
                 );
            localIp65504P2886LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2886LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2886L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2886L() {	 
			return (getShort(beginIp65504P2886L));
   	}
         int localIp65504P2887SCounter = -1;
         public boolean isIp65504P2887SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2887SCounter != sharedCounter;
            localIp65504P2887SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2887_S_LEN = 2;
  	/**
	 * serializeIp65504P2887S
	 */
	protected void serializeIp65504P2887S(short ip65504P2887S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2887S,IP_65504_P_2887_S_LEN)
                  ,beginIp65504P2887S
                  ,IP_65504_P_2887_S_LEN
                 );
            localIp65504P2887SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2887SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2887S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2887S() {	 
			return (getShort(beginIp65504P2887S));
   	}
         int localIp65504P2887LCounter = -1;
         public boolean isIp65504P2887LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2887LCounter != sharedCounter;
            localIp65504P2887LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2887_L_LEN = 2;
  	/**
	 * serializeIp65504P2887L
	 */
	protected void serializeIp65504P2887L(short ip65504P2887L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2887L,IP_65504_P_2887_L_LEN)
                  ,beginIp65504P2887L
                  ,IP_65504_P_2887_L_LEN
                 );
            localIp65504P2887LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2887LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2887L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2887L() {	 
			return (getShort(beginIp65504P2887L));
   	}
         int localIp65504P2888SCounter = -1;
         public boolean isIp65504P2888SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2888SCounter != sharedCounter;
            localIp65504P2888SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2888_S_LEN = 2;
  	/**
	 * serializeIp65504P2888S
	 */
	protected void serializeIp65504P2888S(short ip65504P2888S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2888S,IP_65504_P_2888_S_LEN)
                  ,beginIp65504P2888S
                  ,IP_65504_P_2888_S_LEN
                 );
            localIp65504P2888SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2888SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2888S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2888S() {	 
			return (getShort(beginIp65504P2888S));
   	}
         int localIp65504P2888LCounter = -1;
         public boolean isIp65504P2888LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2888LCounter != sharedCounter;
            localIp65504P2888LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2888_L_LEN = 2;
  	/**
	 * serializeIp65504P2888L
	 */
	protected void serializeIp65504P2888L(short ip65504P2888L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2888L,IP_65504_P_2888_L_LEN)
                  ,beginIp65504P2888L
                  ,IP_65504_P_2888_L_LEN
                 );
            localIp65504P2888LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2888LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2888L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2888L() {	 
			return (getShort(beginIp65504P2888L));
   	}
         int localIp65504P2889SCounter = -1;
         public boolean isIp65504P2889SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2889SCounter != sharedCounter;
            localIp65504P2889SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2889_S_LEN = 2;
  	/**
	 * serializeIp65504P2889S
	 */
	protected void serializeIp65504P2889S(short ip65504P2889S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2889S,IP_65504_P_2889_S_LEN)
                  ,beginIp65504P2889S
                  ,IP_65504_P_2889_S_LEN
                 );
            localIp65504P2889SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2889SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2889S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2889S() {	 
			return (getShort(beginIp65504P2889S));
   	}
         int localIp65504P2889LCounter = -1;
         public boolean isIp65504P2889LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2889LCounter != sharedCounter;
            localIp65504P2889LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2889_L_LEN = 2;
  	/**
	 * serializeIp65504P2889L
	 */
	protected void serializeIp65504P2889L(short ip65504P2889L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2889L,IP_65504_P_2889_L_LEN)
                  ,beginIp65504P2889L
                  ,IP_65504_P_2889_L_LEN
                 );
            localIp65504P2889LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2889LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2889L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2889L() {	 
			return (getShort(beginIp65504P2889L));
   	}
         int localIp65504P2890SCounter = -1;
         public boolean isIp65504P2890SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2890SCounter != sharedCounter;
            localIp65504P2890SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2890_S_LEN = 2;
  	/**
	 * serializeIp65504P2890S
	 */
	protected void serializeIp65504P2890S(short ip65504P2890S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2890S,IP_65504_P_2890_S_LEN)
                  ,beginIp65504P2890S
                  ,IP_65504_P_2890_S_LEN
                 );
            localIp65504P2890SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2890SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2890S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2890S() {	 
			return (getShort(beginIp65504P2890S));
   	}
         int localIp65504P2890LCounter = -1;
         public boolean isIp65504P2890LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2890LCounter != sharedCounter;
            localIp65504P2890LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2890_L_LEN = 2;
  	/**
	 * serializeIp65504P2890L
	 */
	protected void serializeIp65504P2890L(short ip65504P2890L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2890L,IP_65504_P_2890_L_LEN)
                  ,beginIp65504P2890L
                  ,IP_65504_P_2890_L_LEN
                 );
            localIp65504P2890LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2890LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2890L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2890L() {	 
			return (getShort(beginIp65504P2890L));
   	}
         int localIp65504P2891SCounter = -1;
         public boolean isIp65504P2891SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2891SCounter != sharedCounter;
            localIp65504P2891SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2891_S_LEN = 2;
  	/**
	 * serializeIp65504P2891S
	 */
	protected void serializeIp65504P2891S(short ip65504P2891S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2891S,IP_65504_P_2891_S_LEN)
                  ,beginIp65504P2891S
                  ,IP_65504_P_2891_S_LEN
                 );
            localIp65504P2891SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2891SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2891S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2891S() {	 
			return (getShort(beginIp65504P2891S));
   	}
         int localIp65504P2891LCounter = -1;
         public boolean isIp65504P2891LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2891LCounter != sharedCounter;
            localIp65504P2891LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2891_L_LEN = 2;
  	/**
	 * serializeIp65504P2891L
	 */
	protected void serializeIp65504P2891L(short ip65504P2891L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2891L,IP_65504_P_2891_L_LEN)
                  ,beginIp65504P2891L
                  ,IP_65504_P_2891_L_LEN
                 );
            localIp65504P2891LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2891LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2891L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2891L() {	 
			return (getShort(beginIp65504P2891L));
   	}
         int localIp65504P2892SCounter = -1;
         public boolean isIp65504P2892SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2892SCounter != sharedCounter;
            localIp65504P2892SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2892_S_LEN = 2;
  	/**
	 * serializeIp65504P2892S
	 */
	protected void serializeIp65504P2892S(short ip65504P2892S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2892S,IP_65504_P_2892_S_LEN)
                  ,beginIp65504P2892S
                  ,IP_65504_P_2892_S_LEN
                 );
            localIp65504P2892SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2892SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2892S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2892S() {	 
			return (getShort(beginIp65504P2892S));
   	}
         int localIp65504P2892LCounter = -1;
         public boolean isIp65504P2892LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2892LCounter != sharedCounter;
            localIp65504P2892LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2892_L_LEN = 2;
  	/**
	 * serializeIp65504P2892L
	 */
	protected void serializeIp65504P2892L(short ip65504P2892L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2892L,IP_65504_P_2892_L_LEN)
                  ,beginIp65504P2892L
                  ,IP_65504_P_2892_L_LEN
                 );
            localIp65504P2892LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2892LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2892L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2892L() {	 
			return (getShort(beginIp65504P2892L));
   	}
         int localIp65504P2893SCounter = -1;
         public boolean isIp65504P2893SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2893SCounter != sharedCounter;
            localIp65504P2893SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2893_S_LEN = 2;
  	/**
	 * serializeIp65504P2893S
	 */
	protected void serializeIp65504P2893S(short ip65504P2893S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2893S,IP_65504_P_2893_S_LEN)
                  ,beginIp65504P2893S
                  ,IP_65504_P_2893_S_LEN
                 );
            localIp65504P2893SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2893SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2893S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2893S() {	 
			return (getShort(beginIp65504P2893S));
   	}
         int localIp65504P2893LCounter = -1;
         public boolean isIp65504P2893LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2893LCounter != sharedCounter;
            localIp65504P2893LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2893_L_LEN = 2;
  	/**
	 * serializeIp65504P2893L
	 */
	protected void serializeIp65504P2893L(short ip65504P2893L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2893L,IP_65504_P_2893_L_LEN)
                  ,beginIp65504P2893L
                  ,IP_65504_P_2893_L_LEN
                 );
            localIp65504P2893LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2893LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2893L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2893L() {	 
			return (getShort(beginIp65504P2893L));
   	}
         int localIp65504P2894SCounter = -1;
         public boolean isIp65504P2894SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2894SCounter != sharedCounter;
            localIp65504P2894SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2894_S_LEN = 2;
  	/**
	 * serializeIp65504P2894S
	 */
	protected void serializeIp65504P2894S(short ip65504P2894S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2894S,IP_65504_P_2894_S_LEN)
                  ,beginIp65504P2894S
                  ,IP_65504_P_2894_S_LEN
                 );
            localIp65504P2894SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2894SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2894S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2894S() {	 
			return (getShort(beginIp65504P2894S));
   	}
         int localIp65504P2894LCounter = -1;
         public boolean isIp65504P2894LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2894LCounter != sharedCounter;
            localIp65504P2894LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2894_L_LEN = 2;
  	/**
	 * serializeIp65504P2894L
	 */
	protected void serializeIp65504P2894L(short ip65504P2894L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2894L,IP_65504_P_2894_L_LEN)
                  ,beginIp65504P2894L
                  ,IP_65504_P_2894_L_LEN
                 );
            localIp65504P2894LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2894LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2894L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2894L() {	 
			return (getShort(beginIp65504P2894L));
   	}
         int localIp65504P2895SCounter = -1;
         public boolean isIp65504P2895SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2895SCounter != sharedCounter;
            localIp65504P2895SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2895_S_LEN = 2;
  	/**
	 * serializeIp65504P2895S
	 */
	protected void serializeIp65504P2895S(short ip65504P2895S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2895S,IP_65504_P_2895_S_LEN)
                  ,beginIp65504P2895S
                  ,IP_65504_P_2895_S_LEN
                 );
            localIp65504P2895SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2895SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2895S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2895S() {	 
			return (getShort(beginIp65504P2895S));
   	}
         int localIp65504P2895LCounter = -1;
         public boolean isIp65504P2895LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2895LCounter != sharedCounter;
            localIp65504P2895LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2895_L_LEN = 2;
  	/**
	 * serializeIp65504P2895L
	 */
	protected void serializeIp65504P2895L(short ip65504P2895L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2895L,IP_65504_P_2895_L_LEN)
                  ,beginIp65504P2895L
                  ,IP_65504_P_2895_L_LEN
                 );
            localIp65504P2895LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2895LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2895L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2895L() {	 
			return (getShort(beginIp65504P2895L));
   	}
         int localIp65504P2896SCounter = -1;
         public boolean isIp65504P2896SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2896SCounter != sharedCounter;
            localIp65504P2896SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2896_S_LEN = 2;
  	/**
	 * serializeIp65504P2896S
	 */
	protected void serializeIp65504P2896S(short ip65504P2896S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2896S,IP_65504_P_2896_S_LEN)
                  ,beginIp65504P2896S
                  ,IP_65504_P_2896_S_LEN
                 );
            localIp65504P2896SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2896SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2896S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2896S() {	 
			return (getShort(beginIp65504P2896S));
   	}
         int localIp65504P2896LCounter = -1;
         public boolean isIp65504P2896LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2896LCounter != sharedCounter;
            localIp65504P2896LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2896_L_LEN = 2;
  	/**
	 * serializeIp65504P2896L
	 */
	protected void serializeIp65504P2896L(short ip65504P2896L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2896L,IP_65504_P_2896_L_LEN)
                  ,beginIp65504P2896L
                  ,IP_65504_P_2896_L_LEN
                 );
            localIp65504P2896LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2896LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2896L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2896L() {	 
			return (getShort(beginIp65504P2896L));
   	}
         int localIp65504P2897SCounter = -1;
         public boolean isIp65504P2897SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2897SCounter != sharedCounter;
            localIp65504P2897SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2897_S_LEN = 2;
  	/**
	 * serializeIp65504P2897S
	 */
	protected void serializeIp65504P2897S(short ip65504P2897S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2897S,IP_65504_P_2897_S_LEN)
                  ,beginIp65504P2897S
                  ,IP_65504_P_2897_S_LEN
                 );
            localIp65504P2897SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2897SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2897S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2897S() {	 
			return (getShort(beginIp65504P2897S));
   	}
         int localIp65504P2897LCounter = -1;
         public boolean isIp65504P2897LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2897LCounter != sharedCounter;
            localIp65504P2897LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2897_L_LEN = 2;
  	/**
	 * serializeIp65504P2897L
	 */
	protected void serializeIp65504P2897L(short ip65504P2897L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2897L,IP_65504_P_2897_L_LEN)
                  ,beginIp65504P2897L
                  ,IP_65504_P_2897_L_LEN
                 );
            localIp65504P2897LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2897LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2897L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2897L() {	 
			return (getShort(beginIp65504P2897L));
   	}
         int localIp65504P2898SCounter = -1;
         public boolean isIp65504P2898SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2898SCounter != sharedCounter;
            localIp65504P2898SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2898_S_LEN = 2;
  	/**
	 * serializeIp65504P2898S
	 */
	protected void serializeIp65504P2898S(short ip65504P2898S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2898S,IP_65504_P_2898_S_LEN)
                  ,beginIp65504P2898S
                  ,IP_65504_P_2898_S_LEN
                 );
            localIp65504P2898SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2898SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2898S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2898S() {	 
			return (getShort(beginIp65504P2898S));
   	}
         int localIp65504P2898LCounter = -1;
         public boolean isIp65504P2898LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2898LCounter != sharedCounter;
            localIp65504P2898LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2898_L_LEN = 2;
  	/**
	 * serializeIp65504P2898L
	 */
	protected void serializeIp65504P2898L(short ip65504P2898L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2898L,IP_65504_P_2898_L_LEN)
                  ,beginIp65504P2898L
                  ,IP_65504_P_2898_L_LEN
                 );
            localIp65504P2898LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2898LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2898L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2898L() {	 
			return (getShort(beginIp65504P2898L));
   	}
         int localIp65504P2899SCounter = -1;
         public boolean isIp65504P2899SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2899SCounter != sharedCounter;
            localIp65504P2899SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2899_S_LEN = 2;
  	/**
	 * serializeIp65504P2899S
	 */
	protected void serializeIp65504P2899S(short ip65504P2899S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2899S,IP_65504_P_2899_S_LEN)
                  ,beginIp65504P2899S
                  ,IP_65504_P_2899_S_LEN
                 );
            localIp65504P2899SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2899SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2899S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2899S() {	 
			return (getShort(beginIp65504P2899S));
   	}
         int localIp65504P2899LCounter = -1;
         public boolean isIp65504P2899LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2899LCounter != sharedCounter;
            localIp65504P2899LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2899_L_LEN = 2;
  	/**
	 * serializeIp65504P2899L
	 */
	protected void serializeIp65504P2899L(short ip65504P2899L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2899L,IP_65504_P_2899_L_LEN)
                  ,beginIp65504P2899L
                  ,IP_65504_P_2899_L_LEN
                 );
            localIp65504P2899LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2899LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2899L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2899L() {	 
			return (getShort(beginIp65504P2899L));
   	}
         int localIp65504P2900SCounter = -1;
         public boolean isIp65504P2900SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2900SCounter != sharedCounter;
            localIp65504P2900SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2900_S_LEN = 2;
  	/**
	 * serializeIp65504P2900S
	 */
	protected void serializeIp65504P2900S(short ip65504P2900S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2900S,IP_65504_P_2900_S_LEN)
                  ,beginIp65504P2900S
                  ,IP_65504_P_2900_S_LEN
                 );
            localIp65504P2900SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2900SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2900S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2900S() {	 
			return (getShort(beginIp65504P2900S));
   	}
         int localIp65504P2900LCounter = -1;
         public boolean isIp65504P2900LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2900LCounter != sharedCounter;
            localIp65504P2900LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2900_L_LEN = 2;
  	/**
	 * serializeIp65504P2900L
	 */
	protected void serializeIp65504P2900L(short ip65504P2900L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2900L,IP_65504_P_2900_L_LEN)
                  ,beginIp65504P2900L
                  ,IP_65504_P_2900_L_LEN
                 );
            localIp65504P2900LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2900LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2900L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2900L() {	 
			return (getShort(beginIp65504P2900L));
   	}
         int localIp65504P2901SCounter = -1;
         public boolean isIp65504P2901SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2901SCounter != sharedCounter;
            localIp65504P2901SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2901_S_LEN = 2;
  	/**
	 * serializeIp65504P2901S
	 */
	protected void serializeIp65504P2901S(short ip65504P2901S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2901S,IP_65504_P_2901_S_LEN)
                  ,beginIp65504P2901S
                  ,IP_65504_P_2901_S_LEN
                 );
            localIp65504P2901SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2901SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2901S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2901S() {	 
			return (getShort(beginIp65504P2901S));
   	}
         int localIp65504P2901LCounter = -1;
         public boolean isIp65504P2901LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2901LCounter != sharedCounter;
            localIp65504P2901LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2901_L_LEN = 2;
  	/**
	 * serializeIp65504P2901L
	 */
	protected void serializeIp65504P2901L(short ip65504P2901L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2901L,IP_65504_P_2901_L_LEN)
                  ,beginIp65504P2901L
                  ,IP_65504_P_2901_L_LEN
                 );
            localIp65504P2901LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2901LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2901L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2901L() {	 
			return (getShort(beginIp65504P2901L));
   	}
         int localIp65504P2902SCounter = -1;
         public boolean isIp65504P2902SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2902SCounter != sharedCounter;
            localIp65504P2902SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2902_S_LEN = 2;
  	/**
	 * serializeIp65504P2902S
	 */
	protected void serializeIp65504P2902S(short ip65504P2902S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2902S,IP_65504_P_2902_S_LEN)
                  ,beginIp65504P2902S
                  ,IP_65504_P_2902_S_LEN
                 );
            localIp65504P2902SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2902SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2902S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2902S() {	 
			return (getShort(beginIp65504P2902S));
   	}
         int localIp65504P2902LCounter = -1;
         public boolean isIp65504P2902LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2902LCounter != sharedCounter;
            localIp65504P2902LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2902_L_LEN = 2;
  	/**
	 * serializeIp65504P2902L
	 */
	protected void serializeIp65504P2902L(short ip65504P2902L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2902L,IP_65504_P_2902_L_LEN)
                  ,beginIp65504P2902L
                  ,IP_65504_P_2902_L_LEN
                 );
            localIp65504P2902LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2902LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2902L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2902L() {	 
			return (getShort(beginIp65504P2902L));
   	}
         int localIp65504P2903SCounter = -1;
         public boolean isIp65504P2903SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2903SCounter != sharedCounter;
            localIp65504P2903SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2903_S_LEN = 2;
  	/**
	 * serializeIp65504P2903S
	 */
	protected void serializeIp65504P2903S(short ip65504P2903S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2903S,IP_65504_P_2903_S_LEN)
                  ,beginIp65504P2903S
                  ,IP_65504_P_2903_S_LEN
                 );
            localIp65504P2903SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2903SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2903S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2903S() {	 
			return (getShort(beginIp65504P2903S));
   	}
         int localIp65504P2903LCounter = -1;
         public boolean isIp65504P2903LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2903LCounter != sharedCounter;
            localIp65504P2903LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2903_L_LEN = 2;
  	/**
	 * serializeIp65504P2903L
	 */
	protected void serializeIp65504P2903L(short ip65504P2903L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2903L,IP_65504_P_2903_L_LEN)
                  ,beginIp65504P2903L
                  ,IP_65504_P_2903_L_LEN
                 );
            localIp65504P2903LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2903LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2903L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2903L() {	 
			return (getShort(beginIp65504P2903L));
   	}
         int localIp65504P2904SCounter = -1;
         public boolean isIp65504P2904SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2904SCounter != sharedCounter;
            localIp65504P2904SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2904_S_LEN = 2;
  	/**
	 * serializeIp65504P2904S
	 */
	protected void serializeIp65504P2904S(short ip65504P2904S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2904S,IP_65504_P_2904_S_LEN)
                  ,beginIp65504P2904S
                  ,IP_65504_P_2904_S_LEN
                 );
            localIp65504P2904SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2904SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2904S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2904S() {	 
			return (getShort(beginIp65504P2904S));
   	}
         int localIp65504P2904LCounter = -1;
         public boolean isIp65504P2904LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2904LCounter != sharedCounter;
            localIp65504P2904LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2904_L_LEN = 2;
  	/**
	 * serializeIp65504P2904L
	 */
	protected void serializeIp65504P2904L(short ip65504P2904L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2904L,IP_65504_P_2904_L_LEN)
                  ,beginIp65504P2904L
                  ,IP_65504_P_2904_L_LEN
                 );
            localIp65504P2904LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2904LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2904L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2904L() {	 
			return (getShort(beginIp65504P2904L));
   	}
         int localIp65504P2905SCounter = -1;
         public boolean isIp65504P2905SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2905SCounter != sharedCounter;
            localIp65504P2905SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2905_S_LEN = 2;
  	/**
	 * serializeIp65504P2905S
	 */
	protected void serializeIp65504P2905S(short ip65504P2905S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2905S,IP_65504_P_2905_S_LEN)
                  ,beginIp65504P2905S
                  ,IP_65504_P_2905_S_LEN
                 );
            localIp65504P2905SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2905SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2905S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2905S() {	 
			return (getShort(beginIp65504P2905S));
   	}
         int localIp65504P2905LCounter = -1;
         public boolean isIp65504P2905LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2905LCounter != sharedCounter;
            localIp65504P2905LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2905_L_LEN = 2;
  	/**
	 * serializeIp65504P2905L
	 */
	protected void serializeIp65504P2905L(short ip65504P2905L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2905L,IP_65504_P_2905_L_LEN)
                  ,beginIp65504P2905L
                  ,IP_65504_P_2905_L_LEN
                 );
            localIp65504P2905LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2905LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2905L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2905L() {	 
			return (getShort(beginIp65504P2905L));
   	}
         int localIp65504P2906SCounter = -1;
         public boolean isIp65504P2906SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2906SCounter != sharedCounter;
            localIp65504P2906SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2906_S_LEN = 2;
  	/**
	 * serializeIp65504P2906S
	 */
	protected void serializeIp65504P2906S(short ip65504P2906S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2906S,IP_65504_P_2906_S_LEN)
                  ,beginIp65504P2906S
                  ,IP_65504_P_2906_S_LEN
                 );
            localIp65504P2906SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2906SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2906S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2906S() {	 
			return (getShort(beginIp65504P2906S));
   	}
         int localIp65504P2906LCounter = -1;
         public boolean isIp65504P2906LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2906LCounter != sharedCounter;
            localIp65504P2906LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2906_L_LEN = 2;
  	/**
	 * serializeIp65504P2906L
	 */
	protected void serializeIp65504P2906L(short ip65504P2906L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2906L,IP_65504_P_2906_L_LEN)
                  ,beginIp65504P2906L
                  ,IP_65504_P_2906_L_LEN
                 );
            localIp65504P2906LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2906LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2906L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2906L() {	 
			return (getShort(beginIp65504P2906L));
   	}
         int localIp65504P2907SCounter = -1;
         public boolean isIp65504P2907SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2907SCounter != sharedCounter;
            localIp65504P2907SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2907_S_LEN = 2;
  	/**
	 * serializeIp65504P2907S
	 */
	protected void serializeIp65504P2907S(short ip65504P2907S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2907S,IP_65504_P_2907_S_LEN)
                  ,beginIp65504P2907S
                  ,IP_65504_P_2907_S_LEN
                 );
            localIp65504P2907SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2907SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2907S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2907S() {	 
			return (getShort(beginIp65504P2907S));
   	}
         int localIp65504P2907LCounter = -1;
         public boolean isIp65504P2907LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2907LCounter != sharedCounter;
            localIp65504P2907LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2907_L_LEN = 2;
  	/**
	 * serializeIp65504P2907L
	 */
	protected void serializeIp65504P2907L(short ip65504P2907L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2907L,IP_65504_P_2907_L_LEN)
                  ,beginIp65504P2907L
                  ,IP_65504_P_2907_L_LEN
                 );
            localIp65504P2907LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2907LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2907L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2907L() {	 
			return (getShort(beginIp65504P2907L));
   	}
         int localIp65504P2908SCounter = -1;
         public boolean isIp65504P2908SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2908SCounter != sharedCounter;
            localIp65504P2908SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2908_S_LEN = 2;
  	/**
	 * serializeIp65504P2908S
	 */
	protected void serializeIp65504P2908S(short ip65504P2908S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2908S,IP_65504_P_2908_S_LEN)
                  ,beginIp65504P2908S
                  ,IP_65504_P_2908_S_LEN
                 );
            localIp65504P2908SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2908SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2908S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2908S() {	 
			return (getShort(beginIp65504P2908S));
   	}
         int localIp65504P2908LCounter = -1;
         public boolean isIp65504P2908LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2908LCounter != sharedCounter;
            localIp65504P2908LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2908_L_LEN = 2;
  	/**
	 * serializeIp65504P2908L
	 */
	protected void serializeIp65504P2908L(short ip65504P2908L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2908L,IP_65504_P_2908_L_LEN)
                  ,beginIp65504P2908L
                  ,IP_65504_P_2908_L_LEN
                 );
            localIp65504P2908LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2908LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2908L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2908L() {	 
			return (getShort(beginIp65504P2908L));
   	}
         int localIp65504P2909SCounter = -1;
         public boolean isIp65504P2909SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2909SCounter != sharedCounter;
            localIp65504P2909SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2909_S_LEN = 2;
  	/**
	 * serializeIp65504P2909S
	 */
	protected void serializeIp65504P2909S(short ip65504P2909S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2909S,IP_65504_P_2909_S_LEN)
                  ,beginIp65504P2909S
                  ,IP_65504_P_2909_S_LEN
                 );
            localIp65504P2909SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2909SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2909S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2909S() {	 
			return (getShort(beginIp65504P2909S));
   	}
         int localIp65504P2909LCounter = -1;
         public boolean isIp65504P2909LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2909LCounter != sharedCounter;
            localIp65504P2909LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2909_L_LEN = 2;
  	/**
	 * serializeIp65504P2909L
	 */
	protected void serializeIp65504P2909L(short ip65504P2909L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2909L,IP_65504_P_2909_L_LEN)
                  ,beginIp65504P2909L
                  ,IP_65504_P_2909_L_LEN
                 );
            localIp65504P2909LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2909LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2909L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2909L() {	 
			return (getShort(beginIp65504P2909L));
   	}
         int localIp65504P2910SCounter = -1;
         public boolean isIp65504P2910SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2910SCounter != sharedCounter;
            localIp65504P2910SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2910_S_LEN = 2;
  	/**
	 * serializeIp65504P2910S
	 */
	protected void serializeIp65504P2910S(short ip65504P2910S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2910S,IP_65504_P_2910_S_LEN)
                  ,beginIp65504P2910S
                  ,IP_65504_P_2910_S_LEN
                 );
            localIp65504P2910SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2910SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2910S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2910S() {	 
			return (getShort(beginIp65504P2910S));
   	}
         int localIp65504P2910LCounter = -1;
         public boolean isIp65504P2910LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2910LCounter != sharedCounter;
            localIp65504P2910LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2910_L_LEN = 2;
  	/**
	 * serializeIp65504P2910L
	 */
	protected void serializeIp65504P2910L(short ip65504P2910L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2910L,IP_65504_P_2910_L_LEN)
                  ,beginIp65504P2910L
                  ,IP_65504_P_2910_L_LEN
                 );
            localIp65504P2910LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2910LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2910L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2910L() {	 
			return (getShort(beginIp65504P2910L));
   	}
         int localIp65504P2911SCounter = -1;
         public boolean isIp65504P2911SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2911SCounter != sharedCounter;
            localIp65504P2911SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2911_S_LEN = 2;
  	/**
	 * serializeIp65504P2911S
	 */
	protected void serializeIp65504P2911S(short ip65504P2911S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2911S,IP_65504_P_2911_S_LEN)
                  ,beginIp65504P2911S
                  ,IP_65504_P_2911_S_LEN
                 );
            localIp65504P2911SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2911SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2911S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2911S() {	 
			return (getShort(beginIp65504P2911S));
   	}
         int localIp65504P2911LCounter = -1;
         public boolean isIp65504P2911LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2911LCounter != sharedCounter;
            localIp65504P2911LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2911_L_LEN = 2;
  	/**
	 * serializeIp65504P2911L
	 */
	protected void serializeIp65504P2911L(short ip65504P2911L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2911L,IP_65504_P_2911_L_LEN)
                  ,beginIp65504P2911L
                  ,IP_65504_P_2911_L_LEN
                 );
            localIp65504P2911LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2911LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2911L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2911L() {	 
			return (getShort(beginIp65504P2911L));
   	}
         int localIp65504P2912SCounter = -1;
         public boolean isIp65504P2912SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2912SCounter != sharedCounter;
            localIp65504P2912SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2912_S_LEN = 2;
  	/**
	 * serializeIp65504P2912S
	 */
	protected void serializeIp65504P2912S(short ip65504P2912S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2912S,IP_65504_P_2912_S_LEN)
                  ,beginIp65504P2912S
                  ,IP_65504_P_2912_S_LEN
                 );
            localIp65504P2912SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2912SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2912S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2912S() {	 
			return (getShort(beginIp65504P2912S));
   	}
         int localIp65504P2912LCounter = -1;
         public boolean isIp65504P2912LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2912LCounter != sharedCounter;
            localIp65504P2912LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2912_L_LEN = 2;
  	/**
	 * serializeIp65504P2912L
	 */
	protected void serializeIp65504P2912L(short ip65504P2912L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2912L,IP_65504_P_2912_L_LEN)
                  ,beginIp65504P2912L
                  ,IP_65504_P_2912_L_LEN
                 );
            localIp65504P2912LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2912LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2912L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2912L() {	 
			return (getShort(beginIp65504P2912L));
   	}
         int localIp65504P2913SCounter = -1;
         public boolean isIp65504P2913SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2913SCounter != sharedCounter;
            localIp65504P2913SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2913_S_LEN = 2;
  	/**
	 * serializeIp65504P2913S
	 */
	protected void serializeIp65504P2913S(short ip65504P2913S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2913S,IP_65504_P_2913_S_LEN)
                  ,beginIp65504P2913S
                  ,IP_65504_P_2913_S_LEN
                 );
            localIp65504P2913SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2913SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2913S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2913S() {	 
			return (getShort(beginIp65504P2913S));
   	}
         int localIp65504P2913LCounter = -1;
         public boolean isIp65504P2913LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2913LCounter != sharedCounter;
            localIp65504P2913LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2913_L_LEN = 2;
  	/**
	 * serializeIp65504P2913L
	 */
	protected void serializeIp65504P2913L(short ip65504P2913L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2913L,IP_65504_P_2913_L_LEN)
                  ,beginIp65504P2913L
                  ,IP_65504_P_2913_L_LEN
                 );
            localIp65504P2913LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2913LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2913L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2913L() {	 
			return (getShort(beginIp65504P2913L));
   	}
         int localIp65504P2914SCounter = -1;
         public boolean isIp65504P2914SModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2914SCounter != sharedCounter;
            localIp65504P2914SCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2914_S_LEN = 2;
  	/**
	 * serializeIp65504P2914S
	 */
	protected void serializeIp65504P2914S(short ip65504P2914S) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2914S,IP_65504_P_2914_S_LEN)
                  ,beginIp65504P2914S
                  ,IP_65504_P_2914_S_LEN
                 );
            localIp65504P2914SCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2914SMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2914S is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2914S() {	 
			return (getShort(beginIp65504P2914S));
   	}
         int localIp65504P2914LCounter = -1;
         public boolean isIp65504P2914LModified() {
            int sharedCounter = shareString.getSerializedField().getModifiedCounter(); 
            boolean hasModified = localIp65504P2914LCounter != sharedCounter;
            localIp65504P2914LCounter = sharedCounter; return hasModified; 
         }
   protected static final int IP_65504_P_2914_L_LEN = 2;
  	/**
	 * serializeIp65504P2914L
	 */
	protected void serializeIp65504P2914L(short ip65504P2914L) {
           replaceValue( //  save the value as string
                   getBinaryString( ip65504P2914L,IP_65504_P_2914_L_LEN)
                  ,beginIp65504P2914L
                  ,IP_65504_P_2914_L_LEN
                 );
            localIp65504P2914LCounter = shareString.getSerializedField().getModifiedCounter();
                 
   }
       
      
   protected short checkIp65504P2914LMaxLimit(long number) {
	   return (short)checkMaxLimit(number, true/*isSigned*/,2/*dataLen*/);
   }
     /**
	 *	refreshIp65504P2914L is used to refresh the latest value of a variable from the Serialized String
	 *  the most common reason to serialize an Object as a string in to write to a file. There can be several other reasons for serialization as well
	 */ 
   	public short refreshIp65504P2914L() {	 
			return (getShort(beginIp65504P2914L));
   	}




}
  
