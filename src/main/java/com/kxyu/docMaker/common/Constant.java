package com.kxyu.docMaker.common;

/**
 * @Author: kxyuyuyu
 * @Date: Created in 13:35 2018/1/25
 */
public class Constant {

    public  static final String OK                            =  "ok!!!";

    //Charset
    public  static final String CHARSET_NAME_UTF_8            =  "UTF-8";

    //QC
    public  static final boolean QC_IS_CANCER                 =  true;
    public  static final boolean QC_IS_CONTROL                =  false;

    public  static final String  QC_COVERAGE                  =  "coverage";
    public  static final String  QC_TOTAL_READS               =  "Total reads";
    public  static final String  QC_TARGET_REGION             =  "Target region";
    public  static final String  QC_PROPERLY_MAPPED           =  "Properly mapped";
    public  static final String  QC_AVERAGE_SEQUENCE          =  "Average sequence";
    public  static final String  QC_TOTAL_EFFECTIVE_YIELD     =  "Total effective yield";
    public  static final String  QC_EFFECTIVE_YIELD_ON_TARGET =  "Effective yield on target";

    //Chemotherapy
    public  static final Integer CHEMOTHERAPY_JUDGE_INT       =  6;
    public  static final String  CHEMOTHERAPY_JUDGE_STR       =  "Evidence_level";

    //cmd Option
    public  static final String  CMD_TEMLATE_DIR_FILE_NAME    =  "-templateDirFile";
    public  static final String  CMD_TEMLATE_DIR_FILE_USAGE   =  "FreeMark文件夹路径";

    public  static final String  CMD_TEMLATE_FILE_NAME        =  "-temlateFile";
    public  static final String  CMD_TEMLATE_FILE_USAGE       =  "FreeMark模板路径";

    public  static final String  CMD_CANCER_QC_FILE_NAME      =  "-cancerQCFile" ;
    public  static final String  CMD_CANCER_QC_FILE_USAGE     =  "肿瘤组织质控信息文件路径" ;

    public  static final String  CMD_CONTROL_QC_FILE_NAME     =  "-controlQCFile" ;
    public  static final String  CMD_CONTROL_QC_FILE_USAGE    =  "对照组质控信息文件路径" ;

    public  static final String  CMD_CHEMOTHERAPY_NAME        =  "-chemotherapyData" ;
    public  static final String  CMD_CHEMOTHERAPY_USAGE       =  "化疗药物数据库路径" ;

    public  static final String  CMD_OUTPUT_NAME              =  "-output" ;
    public  static final String  CMD_OUTPUT_MATEVAR           =  "metaVar" ;
    public  static final String  CMD_OUTPUT_USAGE             =  "输出word文件路径" ;

    public  static final String  CMD_OPTIONS_NULL             =  "LDA   [options ...] [arguments...]";

    //Freemark Key
             /******** QC Info ********/
    public  static final String  FREEMARK_QC_DATAS            =  "QcDatas";

             /******** Patient Info ********/
    public  static final String  PATIENT_AGE_KEY         =  "PatientAge";
    public  static final String  PATIENT_SEX_KEY         =  "PatientSex";
    public  static final String  PATIENT_NAME_KEY        =  "PatientName";

             /******** Chemotherapy Info ********/
    public  static final String  FREEMARK_CHEMOTHERAPY_LIST   =  "ChemotherapyList";

/************************
 ************************
 **********POI***********
 ************************
 ************************/

    //poi color
    public static  final String  POI_CHEMOTHERAPY_TABLE_COLOR                    =  "FFD39B";

    //poi  Chemotherapy table head
    public static  final String  POI_CHEMOTHERAPY_TABLE_KEY                      =  "chemotherapy_table";
    public static  final String  POI_CHEMOTHERAPY_TABLE_GENE                     =  "基因";
    public static  final String  POI_CHEMOTHERAPY_TABLE_DRUG                     =  "药物";
    public static  final String  POI_CHEMOTHERAPY_TABLE_DISEASE                  =  "疾病";
    public static  final String  POI_CHEMOTHERAPY_TABLE_RS                       =  "RS";
    public static  final String  POI_CHEMOTHERAPY_TABLE_EVIDENCE_LEVEL           =  "证据等级";
    public static  final String  POI_CHEMOTHERAPY_TABLE_GENOTYPE                 =  "基因型";
    public static  final String  POI_CHEMOTHERAPY_TABLE_CLINIC                   =  "临床指导";


    /************************
     ************************
     **********BRCA***********
     ************************
     ************************/

    public static   final String  BRCA_DATE                                      =  "date";
    public static   final String  BRCA_DATE_ONE                                  =  "date1";
    public static   final String  BRCA_TABLE                                     =  "mBrcaTable";
    public static   final String  BRCA_TWO_UNKNOWN_COUNT                         =  "mBrca2Unknown";
    public static   final String  BRCA_ONE_UNKNOWN_COUNT                         =  "mBrca1Unknown";
    public static   final String  BRCA_ONE_BENIGN_COUNT                          =  "mBrca1BenignCount";
    public static   final String  BRCA_TWO_BENIGN_COUNT                          =  "mBrca2BenignCount";

    public static   final String  BRCA_TABLE_GENE                                =  "基因";
    public static   final String  BRCA_TABLE_DBSNP                               =  "dbsnp";
    public static   final String  BRCA_TABLE_HEAD_COLOR                          =  "FFD39B";
    public static   final String  BRCA_TABLE_MUTION                              =  "突变名称";
    public static   final String  BRCA_TABLE_CLINSIG                             =  "临床意义";
    public static   final String  BRCA_TABLE_GENOTYPE                            =  "受检者基因型";

    public static   final String  BRCA_NO_CONFIRM                                =  "待确认";
    public static   final String  BRCA_NO_SIGNIFICANCE                           =  "意义未明";
    public static   final String  BRCA_BENGIN                                    =  "良性";
    public static   final String  BRCA_JUDGE_BENGIN                              =  "benign";
    public static   final String  BRCA_JUDGE_UNCERTAIN_SIGNIFICANCE              =  "uncertain significance";
    public static   final String  BRCA_JUDGE_PATHOGENIC                          =  "pathogenic";
    public static   final String  BRCA_JUDGE_POINT                               =  ".";

    //BRCA CMD Option
    public static   final String  BRCA_CMD_OUTPUT_PATH                           =  "-output";
    public static   final String  BRCA_CMD_DOC_TEMPLATE_PATH                     =  "-doctemplate";
    public static   final String  BRCA_CMD_DATA_PATH                             =  "-data";
}
