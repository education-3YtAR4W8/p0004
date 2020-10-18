package education.p0004.common;

public class Const {
    // 予約種類（予約なし）
    public static final String RESERVATION_KIND_NONE = "0";
    // 予約種類（自身の予約）
    public static final String RESERVATION_KIND_PRIMARY = "1";
    // 予約種類（他者の予約）
    public static final String RESERVATION_KIND_SECONDARY = "2";
    // 終了時刻に付与する用のサフィックス
    public static final String SUFFIX_END_TIME = "e";
    // 予約成功メッセージ
    public static final String RESULT_MSG_RESERVE_SUCCESS = "予約しました。";
    // 予約失敗メッセージ
    public static final String RESULT_MSG_RESERVE_FAILED = "予約できませんでした。";
    // 予約失敗（入力情報エラー）メッセージ
    public static final String RESULT_MSG_RESERVE_INPUT_INVALID_VALUE = "予約時間を選択してください。";
    // 予約失敗（時間整合性エラー）メッセージ
    public static final String RESULT_MSG_RESERVE_INCORRECT_TIME = "正しく時間を選択してください。";
    // 予約失敗（時間重複エラー）メッセージ
    public static final String RESULT_MSG_RESERVE_OVERLAPPING_TIME = "選択した時間には既に予約があります。別の時間を選択してください。";
    // 予約削除成功メッセージ
    public static final String RESULT_MSG_DELETE_SUCCESS = "予約を削除しました。";
    // 予約削除失敗メッセージ
    public static final String RESULT_MSG_DELETE_FAILED = "予約を削除できませんでした。";
    // 削除対象予約未選択メッセージ
    public static final String RESULT_MSG_DELETE_UNSELECTED = "削除する予約を選択してください。";
    // 0時～23時
    public static final int[] HOURS = {
            0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11,
            12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23
    };
    // 0分～45分
    public static final int[] MINUTES = {
            0, 15, 30, 45
    };
}
