package com.cloudframe.app.bm80022.dto.serialize;

/**
*  The class Ge1801ArraySerialized is used to define offsets in order to serialize
*  in a fixed String
*  @author CloudFrame Inc.
*  created on 2025-04-23 at 10:07. using version 5.0.0.254
**/

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.cloudframe.app.data.Field;
import com.cloudframe.app.exception.CFException;

public class Ge1801ArraySerialized  extends Field { 

    protected Logger logger = LoggerFactory.getLogger(Ge1801ArraySerialized.class);
	/*  Length of the field, if serialized as a String */
	protected static final int GE_1801_ARRAY_LENGTH = 26200;
   /*  offset of each of Child Fields when serialized as a String */
           protected int beginGe1801ACodentid;
           protected static final int GE_1801_ACODENTID_SIZE = 200;
           protected int beginGe1801ATipproduct;
           protected static final int GE_1801_ATIPPRODUCT_SIZE = 200;
           protected int beginGe1801ACodcontrat;
           protected static final int GE_1801_ACODCONTRAT_SIZE = 200;
           protected int beginGe1801AOfigestora;
           protected static final int GE_1801_AOFIGESTORA_SIZE = 200;
           protected int beginGe1801AIdepsig;
           protected static final int GE_1801_AIDEPSIG_SIZE = 200;
           protected int beginGe1801ANumpersona;
           protected static final int GE_1801_ANUMPERSONA_SIZE = 200;
           protected int beginGe1801ANumcartera;
           protected static final int GE_1801_ANUMCARTERA_SIZE = 200;
           protected int beginGe1801ACodcartera;
           protected static final int GE_1801_ACODCARTERA_SIZE = 200;
           protected int beginGe1801AFechaalta;
           protected static final int GE_1801_AFECHAALTA_SIZE = 200;
           protected int beginGe1801AFechabaja;
           protected static final int GE_1801_AFECHABAJA_SIZE = 200;
           protected int beginGe1801ACodnodo;
           protected static final int GE_1801_ACODNODO_SIZE = 200;
           protected int beginGe1801AResambito;
           protected static final int GE_1801_ARESAMBITO_SIZE = 200;
           protected int beginGe1801ANumresamb;
           protected static final int GE_1801_ANUMRESAMB_SIZE = 200;
           protected int beginGe1801ANumpresamb;
           protected static final int GE_1801_ANUMPRESAMB_SIZE = 200;
           protected int beginGe1801ACengescapt;
           protected static final int GE_1801_ACENGESCAPT_SIZE = 200;
           protected int beginGe1801ANumgescap;
           protected static final int GE_1801_ANUMGESCAP_SIZE = 200;
           protected int beginGe1801ANumpgescap;
           protected static final int GE_1801_ANUMPGESCAP_SIZE = 200;
           protected int beginGe1801ANumpesprie;
           protected static final int GE_1801_ANUMPESPRIE_SIZE = 200;
           protected int beginGe1801ACodcarrie;
           protected static final int GE_1801_ACODCARRIE_SIZE = 200;
           protected int beginGe1801AFecciecurso;
           protected static final int GE_1801_AFECCIECURSO_SIZE = 200;
	
	/**
	* Constructor for Ge1801ArraySerialized
	**/
    public Ge1801ArraySerialized() {
		   			init(0);
    }
 
	/**
	* initializes the field in Ge1801ArraySerialized
	**/
	@Override
	protected void init(int begin) {
	   setStartOffset(begin);
	   setLength(GE_1801_ARRAY_LENGTH);
	   /*  set the offset/position of each field when this object is serialized as String */
	        beginGe1801ACodentid = getStartOffset() + 0; // set offset for serialization
  
	        beginGe1801ATipproduct = getStartOffset() + 400; // set offset for serialization
  
	        beginGe1801ACodcontrat = getStartOffset() + 1000; // set offset for serialization
  
	        beginGe1801AOfigestora = getStartOffset() + 2600; // set offset for serialization
  
	        beginGe1801AIdepsig = getStartOffset() + 3200; // set offset for serialization
  
	        beginGe1801ANumpersona = getStartOffset() + 5600; // set offset for serialization
  
	        beginGe1801ANumcartera = getStartOffset() + 6400; // set offset for serialization
  
	        beginGe1801ACodcartera = getStartOffset() + 7400; // set offset for serialization
  
	        beginGe1801AFechaalta = getStartOffset() + 9000; // set offset for serialization
  
	        beginGe1801AFechabaja = getStartOffset() + 11000; // set offset for serialization
  
	        beginGe1801ACodnodo = getStartOffset() + 13000; // set offset for serialization
  
	        beginGe1801AResambito = getStartOffset() + 14600; // set offset for serialization
  
	        beginGe1801ANumresamb = getStartOffset() + 17000; // set offset for serialization
  
	        beginGe1801ANumpresamb = getStartOffset() + 17800; // set offset for serialization
  
	        beginGe1801ACengescapt = getStartOffset() + 18600; // set offset for serialization
  
	        beginGe1801ANumgescap = getStartOffset() + 20200; // set offset for serialization
  
	        beginGe1801ANumpgescap = getStartOffset() + 21000; // set offset for serialization
  
	        beginGe1801ANumpesprie = getStartOffset() + 21800; // set offset for serialization
  
	        beginGe1801ACodcarrie = getStartOffset() + 22600; // set offset for serialization
  
	        beginGe1801AFecciecurso = getStartOffset() + 24200; // set offset for serialization
  
	   /*  end of offset */
	}
 
   
  protected  static final int GE_1801_ACODENTID_LEN = 2;
   /**
	 *	serializeGe1801ACodentid as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeGe1801ACodentid(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginGe1801ACodentid + index*GE_1801_ACODENTID_LEN)
   	          , GE_1801_ACODENTID_LEN 
   	          );
   }
 
   
  protected  static final int GE_1801_ATIPPRODUCT_LEN = 3;
   /**
	 *	serializeGe1801ATipproduct as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeGe1801ATipproduct(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginGe1801ATipproduct + index*GE_1801_ATIPPRODUCT_LEN)
   	          , GE_1801_ATIPPRODUCT_LEN 
   	          );
   }
   protected static final int GE_1801_ACODCONTRAT_LEN = 8;
   protected static final int GE_1801_ACODCONTRAT_SCALE = 0;
    /**
	 * 	serializes this Ge1801ACodcontrat as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeGe1801ACodcontrat(int index, long value) {
	       replaceValue(  
	            getPackedString(value,GE_1801_ACODCONTRAT_LEN,GE_1801_ACODCONTRAT_SCALE,true)
	            ,(beginGe1801ACodcontrat + index*GE_1801_ACODCONTRAT_LEN) 
	            , GE_1801_ACODCONTRAT_LEN  
	            );
   }
   protected static final int GE_1801_AOFIGESTORA_LEN = 3;
   protected static final int GE_1801_AOFIGESTORA_SCALE = 0;
    /**
	 * 	serializes this Ge1801AOfigestora as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeGe1801AOfigestora(int index, short value) {
	       replaceValue(  
	            getPackedString(value,GE_1801_AOFIGESTORA_LEN,GE_1801_AOFIGESTORA_SCALE,true)
	            ,(beginGe1801AOfigestora + index*GE_1801_AOFIGESTORA_LEN) 
	            , GE_1801_AOFIGESTORA_LEN  
	            );
   }
 
   
  protected  static final int GE_1801_AIDEPSIG_LEN = 12;
   /**
	 *	serializeGe1801AIdepsig as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeGe1801AIdepsig(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginGe1801AIdepsig + index*GE_1801_AIDEPSIG_LEN)
   	          , GE_1801_AIDEPSIG_LEN 
   	          );
   }

	protected static final int GE_1801_ANUMPERSONA_LEN = 4;
    /**
	 * 	serialize this Ge1801ANumpersona as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeGe1801ANumpersona(int index, int value) {
           int number = value;
           replaceValue( getBinaryString(number) , (beginGe1801ANumpersona + index*GE_1801_ANUMPERSONA_LEN), GE_1801_ANUMPERSONA_LEN);
   }
   protected static final int GE_1801_ANUMCARTERA_LEN = 5;
   protected static final int GE_1801_ANUMCARTERA_SCALE = 0;
    /**
	 * 	serializes this Ge1801ANumcartera as String
	 *	@param index
	 *	@param value 
	 */
	protected void serializeGe1801ANumcartera(int index, int value) {
	       replaceValue(  
	            getPackedString(value,GE_1801_ANUMCARTERA_LEN,GE_1801_ANUMCARTERA_SCALE,true)
	            ,(beginGe1801ANumcartera + index*GE_1801_ANUMCARTERA_LEN) 
	            , GE_1801_ANUMCARTERA_LEN  
	            );
   }
 
   
  protected  static final int GE_1801_ACODCARTERA_LEN = 8;
   /**
	 *	serializeGe1801ACodcartera as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeGe1801ACodcartera(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginGe1801ACodcartera + index*GE_1801_ACODCARTERA_LEN)
   	          , GE_1801_ACODCARTERA_LEN 
   	          );
   }
 
   
  protected  static final int GE_1801_AFECHAALTA_LEN = 10;
   /**
	 *	serializeGe1801AFechaalta as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeGe1801AFechaalta(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginGe1801AFechaalta + index*GE_1801_AFECHAALTA_LEN)
   	          , GE_1801_AFECHAALTA_LEN 
   	          );
   }
 
   
  protected  static final int GE_1801_AFECHABAJA_LEN = 10;
   /**
	 *	serializeGe1801AFechabaja as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeGe1801AFechabaja(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginGe1801AFechabaja + index*GE_1801_AFECHABAJA_LEN)
   	          , GE_1801_AFECHABAJA_LEN 
   	          );
   }
 
   
  protected  static final int GE_1801_ACODNODO_LEN = 8;
   /**
	 *	serializeGe1801ACodnodo as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeGe1801ACodnodo(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginGe1801ACodnodo + index*GE_1801_ACODNODO_LEN)
   	          , GE_1801_ACODNODO_LEN 
   	          );
   }
 
   
  protected  static final int GE_1801_ARESAMBITO_LEN = 12;
   /**
	 *	serializeGe1801AResambito as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeGe1801AResambito(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginGe1801AResambito + index*GE_1801_ARESAMBITO_LEN)
   	          , GE_1801_ARESAMBITO_LEN 
   	          );
   }

	protected static final int GE_1801_ANUMRESAMB_LEN = 4;
    /**
	 * 	serialize this Ge1801ANumresamb as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeGe1801ANumresamb(int index, int value) {
           int number = value;
           replaceValue( getBinaryString(number) , (beginGe1801ANumresamb + index*GE_1801_ANUMRESAMB_LEN), GE_1801_ANUMRESAMB_LEN);
   }

	protected static final int GE_1801_ANUMPRESAMB_LEN = 4;
    /**
	 * 	serialize this Ge1801ANumpresamb as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeGe1801ANumpresamb(int index, int value) {
           int number = value;
           replaceValue( getBinaryString(number) , (beginGe1801ANumpresamb + index*GE_1801_ANUMPRESAMB_LEN), GE_1801_ANUMPRESAMB_LEN);
   }
 
   
  protected  static final int GE_1801_ACENGESCAPT_LEN = 8;
   /**
	 *	serializeGe1801ACengescapt as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeGe1801ACengescapt(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginGe1801ACengescapt + index*GE_1801_ACENGESCAPT_LEN)
   	          , GE_1801_ACENGESCAPT_LEN 
   	          );
   }

	protected static final int GE_1801_ANUMGESCAP_LEN = 4;
    /**
	 * 	serialize this Ge1801ANumgescap as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeGe1801ANumgescap(int index, int value) {
           int number = value;
           replaceValue( getBinaryString(number) , (beginGe1801ANumgescap + index*GE_1801_ANUMGESCAP_LEN), GE_1801_ANUMGESCAP_LEN);
   }

	protected static final int GE_1801_ANUMPGESCAP_LEN = 4;
    /**
	 * 	serialize this Ge1801ANumpgescap as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeGe1801ANumpgescap(int index, int value) {
           int number = value;
           replaceValue( getBinaryString(number) , (beginGe1801ANumpgescap + index*GE_1801_ANUMPGESCAP_LEN), GE_1801_ANUMPGESCAP_LEN);
   }

	protected static final int GE_1801_ANUMPESPRIE_LEN = 4;
    /**
	 * 	serialize this Ge1801ANumpesprie as String
	 *  @param index
	 *	@param value
	 */
	protected void serializeGe1801ANumpesprie(int index, int value) {
           int number = value;
           replaceValue( getBinaryString(number) , (beginGe1801ANumpesprie + index*GE_1801_ANUMPESPRIE_LEN), GE_1801_ANUMPESPRIE_LEN);
   }
 
   
  protected  static final int GE_1801_ACODCARRIE_LEN = 8;
   /**
	 *	serializeGe1801ACodcarrie as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeGe1801ACodcarrie(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginGe1801ACodcarrie + index*GE_1801_ACODCARRIE_LEN)
   	          , GE_1801_ACODCARRIE_LEN 
   	          );
   }
 
   
  protected  static final int GE_1801_AFECCIECURSO_LEN = 10;
   /**
	 *	serializeGe1801AFecciecurso as String
	 *  @param index
	 *	@param value
	 */
   protected void serializeGe1801AFecciecurso(int index, char[] value) {
   	  replaceValue( 
   	          value
   	          ,(beginGe1801AFecciecurso + index*GE_1801_AFECCIECURSO_LEN)
   	          , GE_1801_AFECCIECURSO_LEN 
   	          );
   }

		public int ge1801ACodentidSize() {
			return GE_1801_ACODENTID_SIZE;
		}
		public int ge1801ATipproductSize() {
			return GE_1801_ATIPPRODUCT_SIZE;
		}
		public int ge1801ACodcontratSize() {
			return GE_1801_ACODCONTRAT_SIZE;
		}
		public int ge1801AOfigestoraSize() {
			return GE_1801_AOFIGESTORA_SIZE;
		}
		public int ge1801AIdepsigSize() {
			return GE_1801_AIDEPSIG_SIZE;
		}
		public int ge1801ANumpersonaSize() {
			return GE_1801_ANUMPERSONA_SIZE;
		}
		public int ge1801ANumcarteraSize() {
			return GE_1801_ANUMCARTERA_SIZE;
		}
		public int ge1801ACodcarteraSize() {
			return GE_1801_ACODCARTERA_SIZE;
		}
		public int ge1801AFechaaltaSize() {
			return GE_1801_AFECHAALTA_SIZE;
		}
		public int ge1801AFechabajaSize() {
			return GE_1801_AFECHABAJA_SIZE;
		}
		public int ge1801ACodnodoSize() {
			return GE_1801_ACODNODO_SIZE;
		}
		public int ge1801AResambitoSize() {
			return GE_1801_ARESAMBITO_SIZE;
		}
		public int ge1801ANumresambSize() {
			return GE_1801_ANUMRESAMB_SIZE;
		}
		public int ge1801ANumpresambSize() {
			return GE_1801_ANUMPRESAMB_SIZE;
		}
		public int ge1801ACengescaptSize() {
			return GE_1801_ACENGESCAPT_SIZE;
		}
		public int ge1801ANumgescapSize() {
			return GE_1801_ANUMGESCAP_SIZE;
		}
		public int ge1801ANumpgescapSize() {
			return GE_1801_ANUMPGESCAP_SIZE;
		}
		public int ge1801ANumpesprieSize() {
			return GE_1801_ANUMPESPRIE_SIZE;
		}
		public int ge1801ACodcarrieSize() {
			return GE_1801_ACODCARRIE_SIZE;
		}
		public int ge1801AFecciecursoSize() {
			return GE_1801_AFECCIECURSO_SIZE;
		}



}
  
