package mob.textfinder;

public class TextFinder {

    public static void main(String[] args) {
        // Step1
        // テキストファイルから指定文字列が存在するかチェックする
        System.out.println(existText("src/resources/target.txt", "サンアーチ"));

        // Step2
        // Excelから指定文字列があるセルの位置を調べる
        System.out.println(findCellPos("src/resources/target.xlsx", "サンアーチ"));
    }

    /**
     * ************************************************************
     * Step1
     * ************************************************************
     * ★このメソッドを完成させてください
     * 指定の文字列がファイルに含まれているか判定するメソッド
     * @param path 指定ファイルのパス
     * @param searchStr 検索文字列
     * @return
     */
    public static boolean existText(String path, String searchStr) {
        return true;
    }

    /**
     * ************************************************************
     * Step2
     * ************************************************************
     * ★このメソッドを完成させてください
     * 指定文字列が埋め込まれているExcelのCellの位置を検索するメソッド
     * @param path 指定ファイルのパス
     * @param searchStr 検索文字列
     * @return
     */
    public static String findCellPos(String path, String searchStr){
        return null;
    }
}
