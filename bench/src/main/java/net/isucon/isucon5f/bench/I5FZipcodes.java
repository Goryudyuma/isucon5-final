package net.isucon.isucon5f.bench;

public class I5FZipcodes {
    public static String address(String zipcode) {
        for (String[] pair : list) {
            if (pair[0].equals(zipcode)) {
                return pair[1];
            }
        }
        throw new IllegalArgumentException("Argument zipcode does not exist in list: " + zipcode);
    }

    // there's no same zipcode
    public static String[][] list = {
        {"1006334","東京都 千代田区 丸の内丸の内ビルディング　３４階"},
        {"1600022","東京都 新宿区 新宿"},
        {"3771711","群馬県 吾妻郡草津町 草津"},
        {"4050036","山梨県 山梨市 矢坪"},
        {"4103514","静岡県 賀茂郡西伊豆町 仁科"},
        {"3771528","群馬県 吾妻郡嬬恋村 干俣万座温泉"},
        {"3010015","茨城県 龍ケ崎市 長沖町"},
        {"7201415","広島県 神石郡神石高原町 階見"},
        {"0791572","北海道 富良野市 山部西２３線"},
        {"4901445","愛知県 海部郡飛島村 金岡"},
        {"3430845","埼玉県 越谷市 南越谷"},
        {"7470026","山口県 防府市 緑町"},
        {"7313824","広島県 山県郡安芸太田町 寺領"},
        {"9610886","福島県 白河市 影鬼越"},
        {"4160913","静岡県 富士市 平垣本町"},
        {"9320242","富山県 南砺市 谷"},
        {"6795521","兵庫県 佐用郡佐用町 早瀬"},
        {"3390072","埼玉県 さいたま市岩槻区 古ケ場"},
        {"5160114","三重県 度会郡南伊勢町 始神"},
        {"6590076","兵庫県 芦屋市 清水町"},
        {"9812122","宮城県 伊具郡丸森町 福沢"},
        {"9791432","福島県 双葉郡双葉町 松迫"},
        {"5180017","三重県 伊賀市 大谷"},
        {"0994126","北海道 斜里郡斜里町 以久科北"},
        {"6018016","京都府 京都市南区 東九条烏丸町"},
        {"4840021","愛知県 犬山市 杁下"},
        {"8820874","宮崎県 延岡市 伊達町"},
        {"9880582","宮城県 気仙沼市 唐桑町東舞根"},
        {"2640029","千葉県 千葉市若葉区 桜木北"},
        {"0360163","青森県 平川市 苗生松下東田"},
        {"6700009","兵庫県 姫路市 鍵町"},
        {"0791111","北海道 赤平市 若木町北"},
        {"8950043","鹿児島県 薩摩川内市 都町"},
        {"0482332","北海道 余市郡仁木町 長沢西"},
        {"9870132","宮城県 遠田郡涌谷町 小谷地"},
        {"7440061","山口県 下松市 河内出合"},
        {"8120066","福岡県 福岡市東区 二又瀬"},
        {"8115467","長崎県 壱岐市 芦辺町箱崎江角触"},
        {"0490152","北海道 北斗市 押上"},
        {"5202542","滋賀県 蒲生郡竜王町 山中"},
        {"6401165","和歌山県 海南市 ひや水"},
        {"9230965","石川県 小松市 串町"},
        {"2520244","神奈川県 相模原市中央区 田名"},
        {"1630826","東京都 新宿区 西新宿新宿ＮＳビル　２６階"},
        {"9230954","石川県 小松市 八幡町"},
        {"9520316","新潟県 佐渡市 背合"},
        {"8570032","長崎県 佐世保市 宮田町"},
        {"4506025","愛知県 名古屋市中村区 名駅ＪＲセントラルタワーズ　２５階"},
        {"4450877","愛知県 西尾市 山下町"},
        {"6693122","兵庫県 丹波市 山南町玉巻"},
        {"3800831","長野県 長野市 東町"},
        {"0730126","北海道 砂川市 東豊沼"},
        {"6040845","京都府 京都市中京区 二条殿町"},
        {"2380244","神奈川県 三浦市 白石町"},
        {"8900085","鹿児島県 鹿児島市 南新町"},
        {"1076302","東京都 港区 赤坂赤坂Ｂｉｚタワー　２階"},
        {"4443343","愛知県 岡崎市 秦梨町"},
        {"2300031","神奈川県 横浜市鶴見区 平安町"},
        {"9400211","新潟県 長岡市 小貫"},
        {"0392516","青森県 上北郡七戸町 舘野"},
        {"8943107","鹿児島県 大島郡大和村 大金久"},
        {"9880425","宮城県 本吉郡南三陸町 歌津神山"},
        {"0990101","北海道 紋別郡遠軽町 下白滝"},
        {"2890100","千葉県 香取郡神崎町 "},
        {"3950802","長野県 飯田市 鼎下茶屋"},
        {"9896235","宮城県 大崎市 古川宮沢"},
        {"9696531","福島県 河沼郡会津坂下町 東上口甲"},
        {"4300822","静岡県 浜松市南区 東町"},
        {"0630847","北海道 札幌市西区 八軒七条西"},
        {"3280052","栃木県 栃木市 祝町"},
        {"9870354","宮城県 登米市 豊里町下沼田"},
        {"0985722","北海道 枝幸郡浜頓別町 南２条"},
        {"8580908","長崎県 佐世保市 光町"},
        {"6751315","兵庫県 小野市 日吉町"},
        {"4410322","愛知県 豊川市 御津町豊沢松田"},
        {"6008028","京都府 京都市下京区 植松町寺町通松原下る"},
        {"5360008","大阪府 大阪市城東区 関目"},
        {"9498431","新潟県 十日町市 土倉"},
        {"0281303","岩手県 下閉伊郡山田町 荒川"},
        {"9350012","富山県 氷見市 比美町"},
        {"7350013","広島県 安芸郡府中町 浜田"},
        {"7700811","徳島県 徳島市 東吉野町"},
        {"7201145","広島県 福山市 駅家町今岡"},
        {"9993124","山形県 上山市 金生"},
        {"0392613","青森県 上北郡東北町 子ノ鳥平"},
        {"3840001","長野県 小諸市 小原"},
        {"7315116","広島県 広島市佐伯区 八幡"},
        {"8130018","福岡県 福岡市東区 香椎浜ふ頭"},
        {"6461431","和歌山県 田辺市 中辺路町小松原"},
        {"4410323","愛知県 豊川市 御津町金野竹入"},
        {"9391703","富山県 南砺市 一日市"},
        {"2620013","千葉県 千葉市花見川区 犢橋町"},
        {"6792314","兵庫県 神崎郡市川町 北田中"},
        {"4200874","静岡県 静岡市葵区 辰起町"},
        {"0960040","北海道 名寄市 西十条北"},
        {"6792111","兵庫県 姫路市 山田町多田"},
        {"0783162","北海道 留萌市 東幌町"},
        {"7295741","広島県 庄原市 西城町熊野"},
        {"2630015","千葉県 千葉市稲毛区 作草部"},
        {"6562303","兵庫県 淡路市 小磯"},
        {"4440322","愛知県 西尾市 巨海町"},
        {"0670062","北海道 江別市 上江別南町"},
        {"2870101","千葉県 香取市 高萩"},
        {"9230811","石川県 小松市 白江町"},
        {"8620923","熊本県 熊本市中央区 東京塚町"},
        {"6700801","兵庫県 姫路市 仁豊野"},
        {"9292227","石川県 七尾市 中島町藤瀬"},
        {"9013115","沖縄県 島尻郡久米島町 儀間"},
        {"2940811","千葉県 南房総市 中"},
        {"0798418","北海道 旭川市 永山８条"},
        {"1006820","東京都 千代田区 大手町ＪＡビル　２０階"},
        {"8940506","鹿児島県 奄美市 笠利町手花部"},
        {"0691336","北海道 夕張郡長沼町 川沿"},
        {"5230854","滋賀県 近江八幡市 縄手町中"},
        {"8071125","福岡県 北九州市八幡西区 池田"},
        {"0930011","北海道 網走市 南一条西"},
        {"7421513","山口県 熊毛郡田布施町 麻郷団地"},
        {"5810884","大阪府 八尾市 恩智南町"},
        {"7140036","岡山県 笠岡市 白石島"},
        {"7391807","広島県 安芸高田市 高宮町羽佐竹"},
        {"1076009","東京都 港区 赤坂赤坂アークヒルズ・アーク森ビル　９階"},
        {"9814255","宮城県 加美郡加美町 岡町"},
        {"0993201","北海道 網走郡大空町 東藻琴西区"},
        {"5930000","大阪府 堺市西区 "},
        {"8560843","長崎県 大村市 今村町"},
        {"7320041","広島県 広島市東区 矢賀町"},
        {"2640017","千葉県 千葉市若葉区 加曽利町"},
        {"9430633","新潟県 上越市 牧区下昆子"},
        {"6370117","奈良県 五條市 西吉野町賀名生"},
        {"9220844","石川県 加賀市 白望台町"},
        {"5008157","岐阜県 岐阜市 五坪町"},
        {"5060844","岐阜県 高山市 上一之町"},
        {"2850011","千葉県 佐倉市 山崎"},
        {"2850024","千葉県 佐倉市 裏新町"},
        {"1636026","東京都 新宿区 西新宿住友不動産新宿オークタワー　２６階"},
        {"7320818","広島県 広島市南区 段原日出"},
        {"6393323","奈良県 吉野郡吉野町 色生"},
        {"3270313","栃木県 佐野市 吉水町"},
        {"2970003","千葉県 茂原市 北高根飛地"},
        {"5100852","三重県 四日市市 浜旭町"},
        {"7818112","高知県 高知市 高須大谷"},
        {"9330121","富山県 高岡市 伏木矢田新町"},
        {"5192162","三重県 多気郡多気町 笠木"},
        {"0710218","北海道 上川郡美瑛町 大村村山"},
        {"8160801","福岡県 春日市 春日原東町"},
        {"0613244","北海道 石狩市 新港南"},
        {"9540145","新潟県 長岡市 大口"},
        {"9760016","福島県 相馬市 沖ノ内"},
        {"6808062","鳥取県 鳥取市 国府町稲葉丘"},
        {"3501158","埼玉県 川越市 むさし野南"},
        {"9190434","福井県 坂井市 春江町境上町"},
        {"0861014","北海道 標津郡中標津町 東十四条南"},
        {"1620064","東京都 新宿区 市谷仲之町"},
        {"9810941","宮城県 仙台市青葉区 菊田町"},
        {"5060852","岐阜県 高山市 八幡町"},
        {"6018136","京都府 京都市南区 上鳥羽岩ノ本町"},
        {"3111525","茨城県 鉾田市 野友"},
        {"0788811","北海道 旭川市 緑が丘南１条"},
        {"8120888","福岡県 福岡市博多区 板付"},
        {"9051316","沖縄県 国頭郡大宜味村 白浜"},
        {"2220032","神奈川県 横浜市港北区 大豆戸町"},
        {"9594612","新潟県 東蒲原郡阿賀町 岡沢"},
        {"6800401","鳥取県 八頭郡八頭町 上野"},
        {"0560017","北海道 日高郡新ひだか町 静内御幸町"},
        {"7942114","愛媛県 今治市 吉海町名"},
        {"3002343","茨城県 つくばみらい市 狸渕"},
        {"6751311","兵庫県 小野市 万勝寺町"},
        {"4240838","静岡県 静岡市清水区 淡島町"},
        {"8528112","長崎県 長崎市 本尾町"},
        {"6713223","兵庫県 宍粟市 千種町室"},
        {"0801226","北海道 河東郡士幌町 大通西"},
        {"0340022","青森県 十和田市 東二十四番町"},
        {"9330908","富山県 高岡市 木町"},
        {"9300335","富山県 中新川郡上市町 幸町"},
        {"8050050","福岡県 北九州市八幡東区 春の町"},
        {"8594813","長崎県 平戸市 田平町深月免"},
        {"0610222","北海道 石狩郡当別町 元町"},
        {"6560331","兵庫県 南あわじ市 湊里"},
        {"2992521","千葉県 南房総市 白子"},
        {"7715531","徳島県 那賀郡那賀町 日浦"},
        {"0391501","青森県 三戸郡五戸町 上市川"},
        {"6780243","兵庫県 赤穂市 若草町"},
        {"3380835","埼玉県 さいたま市桜区 道場"},
        {"7600005","香川県 高松市 宮脇町"},
        {"0360172","青森県 平川市 葛川長小股"},
        {"4540984","愛知県 名古屋市中川区 供米田"},
        {"4460016","愛知県 安城市 山崎町"},
        {"7012154","岡山県 岡山市北区 原"},
        {"1630650","東京都 新宿区 西新宿新宿センタービル　５０階"},
        {"4550868","愛知県 名古屋市港区 南陽町西福田"},
        {"0718171","北海道 旭川市 東山"},
        {"6910012","島根県 出雲市 西代町"},
        {"7500411","山口県 下関市 豊田町宇内"},
        {"3993300","長野県 下伊那郡松川町 "},
        {"1076190","東京都 港区 赤坂赤坂パークビル"},
        {"8618003","熊本県 熊本市北区 楠"},
        {"8918115","鹿児島県 大島郡伊仙町 古里"},
        {"4180038","静岡県 富士宮市 野中町"},
        {"8790606","大分県 豊後高田市 玉津"},
        {"7891409","高知県 高岡郡中土佐町 大野見竹原"},
        {"9440073","新潟県 妙高市 長森"},
        {"8070845","福岡県 北九州市八幡西区 永犬丸南町"},
        {"0680832","北海道 岩見沢市 ふじ町二条"},
        {"4440834","愛知県 岡崎市 柱町"},
        {"3840621","長野県 佐久市 入澤"},
        {"0590003","北海道 登別市 千歳町"},
        {"0294503","岩手県 胆沢郡金ケ崎町 西根"},
    };
}
