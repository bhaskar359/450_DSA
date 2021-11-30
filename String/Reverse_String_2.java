import java.util.Arrays;

class Reverse_String_2 {
    public String reverseStr(String s, int k) {
        char[] chars = s.toCharArray();
        int i = 0;
        while (i < chars.length) {
            int low = i;
            int high = Math.min(i+k-1,chars.length-1);
            while (low < high) {
                char temp = chars[low];
                chars[low] = chars[high];
                chars[high] = temp;
                low++;
                high--;
                System.out.println(Arrays.toString(chars));
            }
            i = i + 2 * k;
        }
        String nStr = new String(chars);
        return nStr;
    }
}

class Test {
    public static void main(String[] args) {
        System.out.println(new Reverse_String_2().reverseStr("shlhtqylpaeliagpfuhwnrzeogfdbovypuphnlkcyjgkjsrvstlggotnaqgzqlplqcaxlswdyuneaecrzgameehriemjfqwooyrwtdbyvsuvqnbosgjqsksohcjbwzrmqxhwvhaxpniszlavayzyrjfzcutmzazruruykwdcgevabzaeqkblvbhsqkfeaqbuyyvpmlrokgoipomofykzrqchfbviorkyvljqsmgmkcqpjrcreaijmrjzbqmykkjcyuvqgazaxdxeqkneendagixeydgdbbqwmqzzyhmyjvwtzpmjffsbzircdyqftexxzydfsodjgfqzamfqapzxqouklcebsumqenbnitrrwkzmcmwuwcciwcdpuebzzielirrnbahmrwfpzseenqaewegjchcjbpalxyvmqfoifxgpgkllyhfrodrivizxskwvyktehhdpcctrsafdwaygblcjxefrzpbeppmbzsjmbkrciyvnzdlyhlgrcsfbmnirlsuchbveoqkfdcqdwraouznoienxuhzqhajhynzrbwsxpumbqissjexupqmzovfmcsvqyhtxruchschhqutxuevocxptcgxyshioseklnhjnainhthqzaitnzhvlwakhmqdktwkmdvytraojpxmrcxhtkopibomrvcnuhuettwwvspenrbnyomfwfofzifdgkexupaycaomvdrbyylhvsutvjaqzyxjipcazdjojqfbznilcrhpznehfsmmmplrnoyrnixhyuofbsklzfayhzcmitllgilbvmhlbcmqztzttmxskijevvmbhnwwdephvucrmivzxgtbsqeouipbwqazzrqqflwmtuavtcjgtiokwmtyxjwthhnlwfrvxwjtuujgvthebimbeapvdhdntzsanhmcjbbbbdugusypryfrswhxexilmlvkptnwhzczgletbkixvcbvrucxnilaprmuburqhqczenbvnubopmlqgjxwquqsszpsnhhjayqbzkrrrpgtnguxthfhrrdsxqdnhxkqklbrmdphdfnaseyhwhhbjzfclobguzggupecojwlybjqnnebndfrmtqgdflbetfurdekabndomkzhohomdlraokldkeshovcifjarcrjwvdqvnbclkplkpvvuadkfefxfjgtyfgcfksefudkgcdvgbfgibejztvqdnovqmmogelnyxshqycoddbpabjrmlipaeuaugbydkioqreeyewfowebspqpcorxxkyawvvujxekqrvibkjrwxkubyivcqlbatdbggabduejfcrlraxmvqqcqmmeivwldpsaephiufwfjkutpoptjpmzihhcrugnuvnnlaziilbxglgrffdzpxdqwrxmbodycznjptampojzzpunennudcwqdaxugmeixhzinmktarxaakibtconfjmttkeidnyciurcotlolysivbnnmhamklibtzhotxerywyjjmsvqvpawvrhfptyejmrjiwzaeplqchnlzbublsyleavhqnfythwceccxwllwusineynecljfolajuodmzurtwirmvsettqszbugtvfjcgzakmfnhjxbkprueroblmqwjclccqtsmdmahmlhqvuoiiaaqrpihilimercdljfmrzysxirnybnhsqdctgqeggdphwjqxcxantsudtmukqvwudmrjdwatlujkfaasunvxzhxuclfzpzcyudvusttpzhchwpjizpyuwagftskearfhoknnfbfeebqpuysikbthgjlfxjjmybniwwhuthkzioixssepnkvkrgrswjzpnliqosgkzltsvftleksvjakuoukvrhqhmwpfayoknvbmssygqvvoqstqpjjnfgrlrenxywatdvypelyhxapiezogqvrdlpvvfllizbdzvoywrzzrrahmbrnqrefgtyayhesixbthessxniprnvqwiyryeelacnjltyydxlrotukkpxvtavbtljfqacuondyoyoyuiapxblcetvcpwyehgnwyfgzixmsdwfpyvdnmvjbvhvvbkuhbpimipjrelfaqetbwwfmdoiydemgkoaiabbrqztvkdvktmtolvlqzgkamibtelubylljquhbpzmhpkvfzwjhnhdrjeagszyoqxwtmvdrwdrjutnircbumwudtxsiedktojjbtxaknaijpijpyoegkhfdbvzovlcseysllzjqnbjqfwipthruxcewnncfdszmrblelpwecfrgxtkyzoktirzadyxmbyqekawltgftjhsfsaudpsdjzigdehzfskhywfmulmtarknskyywtbzwrdrglqlsdqmybjhettifpomraugoekqzblwdahznvetxetnhvwctpgdebhvodeqqrtfjxysimnmahfuyujlfcjiffalcjrfoaclgapycqyttsghjyizxbjmtcnfnxpnjikimdiplfsxbleivfipuqnkibbwhqqsepmbeeqbmuevomgaednqdinpnwwxfqgfpjujwbzunhbvusammpfuadymqgsxveizjapjwjabqckeiuqnarjdoymtqfkdmpsewrevkdwwlfceyikgamjebwlhvvvjjivqjvhamrxjrfcqtqegtmqwsaehyqazzjwcyktisskwfvnhujibwvrhhivhmexzbtlniaemqxfcgrzcynokcnuihvobwxoxygnlzoadmxbcxawtrgvszzjbsnhlmldzgpdexvieaygrrstjjtyctlagudoubwvibrqocemxmeasirmvprwjbpzxsysfqmpsysbrlmsayuxcuwlhoihpqtvrbnoxskwwzjkweqjlhgfaqszjqjjgnzdglugswqjfzbzqzcersefomcoztgirohjvtcczoxdofgcafdhomovvqojxdgqvtswwozckftmwhumhtkqlyidupxspuruamogtvhksgcyfkypqfopqizckefwdwyvjxehossacahniztazwkdozdcdganamirkrtqvcnmewtmnyuzvthdcrvkjfubrlhzilsrnxsylrqmbslkkbqvtpyhvqcvnqflvxabhbvoukjzdtkkwejtdzcfwzrtjqqkqzhfaznqvtaclkgbbxtpkkrgglcmttcgjhlzxgxznrehbhzwettuzdkbxjswhzyvwqedpjskwhkwwyuoclawmkajpzffgyyhaqcxiqjhgnetpfstjhmvcgxfxzhrfvcysqtkdqvpcnqfgrhjtzbnjzxqpqgivnlsmhwymbdzmrksxxyzvgqycpbivohnwkpnglpwdufvwsqccjuoafquqswkhbxpeqklbuhbzapljsqwzflgeukuyfmhcxvnpfccltzavlmwymapwpusukzqmtdsjngaghlnyemdnejjcefpecdjpmmpmklbiyhhdzliuloiazsvoyahddkvsimhjhpnfgdaseoyilxmvifhdrietkdvkqfajwbkgfnpxkpencplvwzhtaggxcklrawkylmhgylhpnqflnzlragpboeqhbswgvahpltomaucpdtnptsavzxlrwtygtzbmvvfrrzefkhoypyvzrwzkrmzjnasxneyltujmsfgqrmfmnrafiixoxwzwpwjvtefwraekckoipkxkmhbbgntyxofpujpukxjtfykmtnortywtaiuhtilspczrqksxdqnduskagrnejoxxriqbzgbaswixldukkdmecrzpdzdvkaaaqzeoxncnfgwwvdggjvtgcuubrsvaqhbynftmjpwiggomumcjxlyfvzllmdnevepgllkjxjjxdobiqdvihgvakirguqjwsjmzwijeqtanwhwnmzdymfslixancihuwazsntpwcqnfqgdzvcvubtquvywglqcezjqxwyjifnanpwzhuiweyorximtwnvtlmbhxooructixyffoijnmldtnooilzdzsrrxgwiyudyopcszuhpitgiaavjfhvuhvltvewserunhjghscziqrmkxlxqurxfsxepsidvuqvqvclqaqzzpwlyxhqkxexyudmrqzispnlzhzprxaonbhoxiseqfbdiytbklrunkjbgiranjwojbywoxvcwsycwtdbmsrxtazeowcpxzannlltqsztcpjtpenmqkyryvgmokbjqaxcnnglnqqhmhglbekxzhprcjwkylbqzxujhklujuwbhhjunmgqazitgartblhxhyncbqiarnnsqamdgllzhgjjnfjotebjgndxagrjmktahuugrllktcjxsvdasavthosnxaslttegnvojlhivwmrvsqxrrwffpigspzlwbtrwhcpgkkclexaposnsfrooyxvjkihsifyylxtmuhbdxzfakpsnfbufhseraklygtchasqtpiwakugpektlwthycnbwmriywqxqmhidgwuwzmvvnbydskhbigyqgzvshjsbwftoriavtuacfhhatzkuhlogoesjqtlhohazxuoskuqnfukqexjmlqpjuvgxqukggubqnamzuuwkneedhqenpfncojfvpdwzkszpxlcircdyuwbqgiedjzxwaskkiqngsbytbcxowoaigydcjfpwbuanqceehcbsgshwxenypdkfxknaqqdjxjaiawolpttjhdnilowwkhqxwovzffviuilylaenagoumqcopxjoxdljfjwuckkwjlgimgztonqoctbkgrzcipaqompfzfvextvdpqrdmdketpnxcerfmbpsxwwjpeitorxpxkuyeaingvexbxvykcawcxzsvnqrcogoeanqgbfpjdcodgdhmaxscgcagbqqdhpnrwtocnhmievldioybnoiikguojbccewgfdnzzamkusmuugonzfcybasobxgkdfmyagrpxlsupasbksbihybsdazdaapxxwkeioyyexoquiceuxpwnmzqzbsotrwdnjuldtjbmthouhozcwpvmxiwmjjyjrxmqhbejcynwbgqdygvgneclqmfcpwakudvkhefprgpaafvcrbpmsomgxvenaamgiofzawfimuhvhmutmvemgznyfxvjregsymjfbsqllxspijftshjanqpeorrifqyofsdlcrywqiskluwwppgbvybzrsalcetvfuoboksdjvqwgzluryhkwsimdkvdnqhzetojbygqiezubrhyoqbwxkkisqhraeinfrduoqebchffmwmazsegyofrtithqidbgeibwbntzzvpfefoccvvuozpbazlvonqvwrfywzpojhzkpaxmiwgzhgzxxjymwnomdyyolztkimhnmbvfabmufkolnyokhrlnuqueocxsycclcbclbiqnawgjkaymhveaeudkihxokrxaapetqmtiakytwoxrfukslzpaeuikhgkngspugcywrcjnyuyfbglafffkqrctomukojwaliizcjarwgvejuerqantiqxsyopgjpzwnisycdnunxrhhadtblyzhwuosfgqqtqrtpnchnieiunbzjhsnrentowcwhuvwwcmgognknltwclehcxmqcninbpchrryumytxeibwuivhlhazwuccwfjraieyfhfkktlzahyqcyxqxmcpdmqbpqtiguxykiqqfeajiitqubbzykulhvwhgqsylbufapopkjffcdkqmeobijarfcgihyomzqztpenowmeaotjrimopjcgidosppzcutifstkyerzsmubpnrwetohruyfylwqunhxgkypjawdoeduytchakhwadccevmaoaiqjoiffdkuqcaxlcpayvtnjwdgpdsotkdtaibkuarlnoabjcnonzqrhxsjehnfthegzqtyasnftjlrlymrrozkhhwaoksfbvxpypfvixlffhlvnmjbughcrkuylbwnjhxnjpjlntbpxsgtpimxytchqfjdleeasmgnxgrglnlipodlitgirpugtspaepntllzvdtqotexlykdydlhlzwfcpwgpidtmwbtjlmwaomtpnzobkfgqoxaaqgrwkxhebllilsysygjfqmvhleuzrytbaqbofowmdwcnksedbqqrishnoraffexfcggjrlbyuijikyttcigyxxjjbtskyygiadsqtkbrinzxigmjhpfbbmvyxvccwlqunirmfndzqjphttphkmbvwpvtccdheebiveneuervqomlaskfnbjtmhvlgcaxmnkhalgqtvkhyzewzxqdqmkwzbijwuudcgklociougrvzaniixmpgpkauiguqqmlasnjudvbudsurzmppysvyujrtxebzrntzruzttczunrfuxholfrzgginlekghcitzzhfpgfyvjdbultmipwpvrafvglpdxxoehtpumqofsfnavbskfgwkxmfchgyrdkqtcdjzlnnlbcfapwwemygyuwstwznvlzpsmdbmomtrgrcqnxpodxabytzarquesmtaryqwecenklyqojvyfczwhgzkdrvaanwctiokihmxvcyhhftajpfqqtgbgslzftxmygtljaxbvqhprunrsontctmfjxoorrdvubrbqmkztvsecrkevamwdqdukrfhbapjlvydzvbluheadxglbblvuflijmzabwrlmyldtrhukoljgqufyiajqowkvhwgydvcssuccsxgluqzllgabhystkaynnbdwkcwohubwlceauejadmtwxoaezvyfyzgynjvblldbwgotdyahxqaalnoimmvgqaimrfiucfklnddjlrgckntkbjppkmbwifqhoqwutjqqthqpukxmvghwmmodvtjexmixfoteqdruayrpmpqgnxsxrfyqllxvfeixfopzqsemijvwkyuuddcvrbqtgonamqyqdriooorhnkbrkvmuzjiweiddspiogjvvvpkzifuaesjdkaczqwvcejmdxjmyzkcxkasooqhzddcfrucqfkojqrfprjtyjkniuurwciayyuaykwjmrcflexmljdooasotpuucwmacskbhtzsbqfxntmndnoreozcnopwdkomuitikglmtpnnlhwedesifdkvzuwpesrsctmztypkylnxbxihvxznibbalennrvotelsilprwyoqcrglzckrqzoffkyqojmhkintvehkxjuvbuvmoriosnmkxjontjmdwhxbhxlsdzudoseotrmewnpsqrhcnrznmdjtvswcfbujxshctssbeuocwkhmjnryzoqitcdkdedlojmrldtbetvdmlscrfrjfowwdipridbewxrxmjpiagnablphqazdgabumrksmjeksyllakqzbkhearrdaakghvbfthgzcixcwxzpvfkkdjrrgeduzdndggbxmaimqzyowcbscjxgykcnmlmcuhlxdbeerscxjratkwmrbtnbtxedmbhmppxiyzoywsizdmwgpfvxmradojthkytygtrcgscuyhbvbnnldzidykkselpauijowyxbqbumyzkalfnkwndopsmbkwifziyfxjktfbgzesruxgzynuxbbjujrpkddgpkmaelshadhmixuyqoomrudvhitbzwwuiozssuehjxsyoawdigmrctzzgonjzrgcnjsaktlcarbkqmtsnuzlgrrkmdpdolnwnkzjexvujnyxyddnqyzuoajehqqolefhxtypgmkkhjrwnosnzvemzkmsoeyqtkiqckqslbiwwozwzgcuvcdgdhicxcxwxdearctkstpukxdhmocyqesebpcmktjeqmipmmeywwqoalphpxdlhfxxvmcvpgdymixmofcsgmeyivfvkegupmpapngjkvopygydrcrmcacjrpscxsfwmocufkhoprhekneojticslguerdfktpluymqkhseposffpgfcecrtsetbykbxwguyajwfqczjopwvcmadsohkgwjoihnykaghzepvlrvuhdgudmvcxesuacwdiaacqtehsjwwuobfsruynycdkyhtjbugazuqfcnykpqifnpphexivcrrmksenyoxynpawswcstmbelfcidzqdeysycybdwdquzrlynmnogewaonsuverpndtxupcgmhybqqetusuxxjnjerbdrmknweduociyaqvkegujiofdhwdxhhzbbwpowcyxavscltetfssoeppcjtyxlsiyauujhtuniacaqgpzmubhpehwszbwrgqewhsforsdpbnbknzevzjdzmskburxslssstxnbgpcepfawkkzlqdclwwlyosucmspxzbryzkickmacvcltfngypxotxohbqmgyvfqftwzwqtrustimrxezileryjiwyhheeabqrbcadzaeqlwdswcbrlptcturvszgeqfyelyheqfuvsgmlkhifvcgpifhcdrvjllbnmowhberkbhcytgfwkbxqvucipeiifkpgcsojvryapfuetxqwldmvfkbckbkjbuzhhykxskcdntaiwdwtomrdsleqlzbvohuczkdazkeipfjctiencsmzesnmtlzbvjhdowfwmjewqthrxdbznggulhlmndwcyundwrdiutbwkdtuzknuxwflakzkgtdignsjslfsfiiwpmndhpthxpcvgfcgcxrwibpdwukgzqoqwsnflcznhbaiqdmtgsmolmsutjhhgrfngaifqyxjrzvcvlwemancltpzhgmgrkdeuexxyscjtfkardrrbidmlsoskigmwoilslquarjklglxpfklacrnsjloxyyqhxcmwzlcrkjyzjjcydvgmjjuatptwnbifiomsnkhemdueuulyhdecszydpbucmxsogxfhzdaztvalnqojurpmtejbgroxzoxoshgtxcrdbmlzkfpysciydpqnghypldmjriijjxrotfskplvrgpovinjajrkuyduxmnlyfvckvhrrwedgtyypxeocntumaqypqdovxivlrtuigtyspugzxqeayqvelcwdmepkajsnlgjmlskxchiucizcdeywyaridngrbtowozneuqkaekxhkutpnzbqidfauvhtjjvmqqsqrmupprxndmhxssgmfpvayiczbnfphbzkutdxzmkaoiotmlspdqlpotzctovzznkxiwswpblvrdgksivxmdhevoatbunzgepuesggtjogivyqdzdfgjmezbpmwescdtsybqnkyvntpdaabsvwolbzkitrgwwkacxrhmbtvenbjsrrldxeixniojhbqiqrcxvtcuweacserbljvasbusspxpizsnebeqsjljbmoyolaxqcfujevmcszfbwdlsvyyeqclnrzejdpmkrfcmwqvpdhwqckgpoaibdrrjmgblicvjesieqfjfzwnunwhnjqeiicdledxmihpmukxzghxidiyjeclnlpxqqakqiradbjrxbvdeqfkagkvnjsryvnvfscsjkhjprhdjczpbtuedefgtfjswrkjtphevckweolanpkzvktpytpwycioyetuypngdajosvqtwrpumsarpsqmqxmqyvffmdxydfpuqanvptzhspcecegtqbfnasytxzfsecrzxyljcgtjfzwjuqyrgocioqthfkioixzngbyuprzcvngpvwofmjuhmqazgodpzkmydvgsejrsxnfgwutkwoiyxngdkuctzzqvvizierceopstsgfznhfxglnfjwlzpjipcsanpkokftgkebrqkoambillmhvmnxjbdzkxlygddjrwhoadvkvaolaofebxxhankzdtqdoxyomtbymvoxbdbkvjaoseljrzntgaoybzmxjqibklntceynjubcqvsfsklkykitbtadaavbzrzadrzuwpbhilmrwxngpjskqygclompwklnxdxuzzcksgtjdwjeiyfizvkxnplykdspfgtxcqay",234));
    }
}
