package com.yogadimas.faunaindonesia;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    boolean doubleBackToExitPressedOnce = false;
    private RecyclerView rvAnimals;
    private List<Animals> list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Objects.requireNonNull(getSupportActionBar()).setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        getSupportActionBar().setCustomView(R.layout.custom_action_bar_layout);
        ImageButton profil = findViewById(R.id.profile);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent profile = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(profile);
                finish();
            }
        });

        setupEnv();
        setupList();

        loadDataDummy();
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce = false;
            }
        }, 2000);
    }

    private void setupEnv() {
        rvAnimals = findViewById(R.id.rvAnimals);

        list = new ArrayList<>();

    }

    private void setupList() {
        AnimalsAdapter adapter = new AnimalsAdapter(list);
        rvAnimals.setLayoutManager(new LinearLayoutManager(this));
        rvAnimals.setAdapter(adapter);
    }

    private void loadDataDummy() {
        list.add(new Animals(
                R.drawable.anoa,
                "Anoa",
                "1.0",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/6/64/Lowland_anoa.jpg/1200px-Lowland_anoa.jpg",//https://i.postimg.cc/BtyrGk5g/anoa.jpg
                "       The lowland anoa (Bubalus depressicornis) is a small bovid, standing barely over 90 cm (35 in) at the shoulder. It is also known as anoa de Ilanura or anoa des plaines. It is most closely allied to the larger Asian buffaloes, showing the same reversal of the direction of the hair on their backs. The horns are peculiar for their upright direction and comparative straightness, although they have the same triangular section as in other buffaloes. White spots are sometimes present below the eyes and there may be white markings on the legs and back; the absence or presence of these white markings may be indicative of distinct races. The horns of the cows are very small. The nearest allies of the anoa appear to be certain extinct Asian buffaloes, the remains of which have been found in the Siwalik Hills of northern India. In habits, the animal appears to resemble the water buffalo.It is usually solitary, living in lowland forests and wetlands, browsing on plants and understory.\n",
                "Bubalus depressicornis",
                "Animalia",
                "Chordata",
                "Mammalia",
                "Artiodactyla",
                "Bovidae",
                "Bubalus",
                "B. depressicornis"


        ));

        list.add(new Animals(
                R.drawable.badak_bercula_dua,
                "Sumatran Rhinoceros",
                "1.1",
                "https://proxy.duckduckgo.com/iu/?u=http%3A%2F%2Fwww.kembangpete.com%2Fwp-content%2Fuploads%2F2018%2F10%2F14.-gambar-badak-bercula-dua.jpg&f=1&nofb=1",
                "       The Sumatran rhinoceros, also known as the hairy rhinoceros or Asian two-horned rhinoceros (Dicerorhinus sumatrensis), is a rare member of the family Rhinocerotidae and one of five extant species of rhinoceros. It is the only extant species of the genus Dicerorhinus. It is the smallest rhinoceros, although it is still a large mammal; it stands 112–145 cm (3.67–4.76 ft) high at the shoulder, with a head-and-body length of 2.36–3.18 m (7.7–10.4 ft) and a tail of 35–70 cm (14–28 in). The weight is reported to range from 500 to 1,000 kg (1,100 to 2,200 lb), averaging 700–800 kg (1,540–1,760 lb), although there is a single record of a 2,000 kg (4,410 lb) specimen. Like both African species, it has two horns; the larger is the nasal horn, typically 15–25 cm (5.9–9.8 in), while the other horn is typically a stub. A coat of reddish-brown hair covers most of the Sumatran rhino's body.\n" +
                        "\n" +
                        "       Members of the species once inhabited rainforests, swamps, and cloud forests in India, Bhutan, Bangladesh, Myanmar, Laos, Thailand, Malaysia, Indonesia, and China. In historical times, they lived in southwest China, particularly in Sichuan.They are now critically endangered, with only five substantial populations in the wild: four in Sumatra and one in Borneo. Their numbers are difficult to determine because they are solitary animals that are widely scattered across their range, but they are estimated to number fewer than 100.[8][9] Survival of the Peninsular Malaysia population is in doubt, and one of the Sumatran populations may already be extinct. In 2015, researchers announced that the Bornean rhinoceros had become extinct from the northern part of Borneo (Sabah, Malaysia).However, a tiny population was discovered in East Kalimantan in early 2016.\n" +
                        "\n" +
                        "       The Sumatran rhino is a mostly solitary animal except for courtship and offspring-rearing. It is the most vocal rhino species and also communicates through marking soil with its feet, twisting saplings into patterns, and leaving excrement. The species is much better studied than the similarly reclusive Javan rhinoceros, in part because of a program that brought 40 Sumatran rhinos into captivity with the goal of preserving the species. There was little or no information about procedures that would assist in ex situ breeding. Though a number of rhinos died once at the various destinations and no offspring were produced for nearly 20 years, the rhinos were all doomed in their soon to be logged forest. In March 2016, a Sumatran rhinoceros (of the Bornean rhinoceros subspecies) was spotted in Indonesian Borneo.\n",
                "Dicerorhinus sumatrensis",
                "Animalia",
                "Chordata",
                "Mammalia",
                "Perissodactyla",
                "Rhinocerotidae",
                "Dicerorhinus",
                "D. sumatrensis"
        ));

        list.add(new Animals(
                R.drawable.badak_bercula_satu,
                "Javan Rhinoceros",
                "1.5",
                "https://proxy.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.penamerdeka.com%2Fwp-content%2Fuploads%2F2017%2F02%2Fbadak-bercula-satu-feature.jpg&f=1&nofb=1",
                "       The Javan rhinoceros (Rhinoceros sondaicus), also known as the Sunda rhinoceros or lesser one-horned rhinoceros, is a very rare member of the family Rhinocerotidae and one of five extant rhinoceroses. It belongs to the same genus as the Indian rhinoceros, and has similar mosaic, armour-like skin, but at 3.1–3.2 m (10–10 ft) in length and 1.4–1.7 m (4.6–5.6 ft) in height, it is smaller (closer in size to the black rhinoceros of the genus Diceros). Its horn is usually shorter than 25 cm (9.8 in), and is smaller than those of the other rhino species. Only adult males have horns; females lack them altogether.\n" +
                        "\n" +
                        "       Once the most widespread of Asian rhinoceroses, the Javan rhinoceros ranged from the islands of Java and Sumatra, throughout Southeast Asia, and into India and China. The species is critically endangered, with only one known population in the wild, and no individuals in captivity. It is possibly the rarest large mammal on Earth,21 with a population of as few as 58 to 61 in Ujung Kulon National Park at the western tip of Java in Indonesia.A second population in Cat Tien National Park in Vietnam was declared by some conservation groups to be extinct in 2011.The decline of the Javan rhinoceros is attributed to poaching, primarily for their horns, which are highly valued in traditional Chinese medicine, fetching as much as US$30,000 per kg on the black market. As European presence in their range increased, trophy hunting also became a serious threat. Loss of habitat, especially as the result of wars, such as the Vietnam War, in Southeast Asia, has also contributed to the species' decline and hindered recovery.[8] The remaining range is within one nationally protected area, but the rhinos are still at risk from poachers, disease, and loss of genetic diversity leading to inbreeding depression.\n" +
                        "\n" +
                        "       The Javan rhino can live around 30–45 years in the wild. It historically inhabited lowland rain forest, wet grasslands, and large floodplains. It is mostly solitary, except for courtship and offspring-rearing, though groups may occasionally congregate near wallows and salt licks. Aside from humans, adults have no predators in their range. The Javan rhino usually avoids humans. Scientists and conservationists rarely study the animals directly due to their extreme rarity and the danger of interfering with such an endangered species. Researchers rely on camera traps and fecal samples to gauge health and behavior. Consequently, the Javan rhino is the least studied of all rhino species. Two adult rhinos with their calves were filmed in a motion-triggered video released on 28 February 2011 by WWF and Indonesia's National Park Authority, which proved it is still breeding in the wild.[9] In April 2012, the National Parks Authority released video showing 35 individual Javan rhinos, including mother/offspring pairs and courting adults.[10] There are only 58 to 68 individuals left in the wild,[11] and none in captivity, after the death of a male rhinoceros named Samson. Samson died in April 2018 at 30 years of age, far younger than the species' usual lifespan of 50 to 60 years, so DNA test is being conducted to explore the cause of death, including the possibility of inbreeding degeneration.\n",
                "Rhinoceras sondaicus",
                "Animalia",
                "Chordata",
                "Mammalia",
                "Perissodactyla",
                "Rhinocerotidae",
                "Rhinoceros",
                "R. sondaicus"
        ));

        list.add(new Animals(
                R.drawable.burung_elang_jawa,
                "Javan Hawk-Eagle",
                "1.6",
                "https://proxy.duckduckgo.com/iu/?u=http%3A%2F%2Fgembiralokazoo.com%2Fuploads%2Fcollections%2Felang-jawa1.jpg&f=1&nofb=1",
                "       The Javan hawk-eagle (Nisaetus bartelsi) (earlier placed in Spizaetus) is a medium-sized, approximately 60 cm long, dark brown raptor in the family Accipitridae. Its head and neck are rufous and it is heavily barred black below. This majestic and intricately patterned eagle has a long, black crest on its head; this crest is held almost vertically and is tipped with white. The crown is black, topping a chestnut head and nape. The back and wings are dark brown, fading to a lighter brown tail which has wide cream stripes. The throat is creamy white with a black stripe, running to the whitish breast and underparts, which are heavily barred with chestnut. Juvenile birds are similar in colour, but have plainer underparts and a duller head.The sexes are similar.\n" +
                        "\n" +
                        "       An Indonesian endemic, the Javan hawk-eagle occurs in humid tropical forests of Java. Its range in East Java includes Sempu Island, Bromo Tengger Semeru National Park, Meru Betiri National Park and Alas Purwo National Park. It can also be seen in captivity in zoos like Kebun Binatang Bandung\n" +
                        "\n" +
                        "       The Javan hawk-eagle is believed to be monogamous. The female usually lays one egg in a nest high on top of a forest tree. The diet consists mainly of birds, lizards, fruit bats and mammals.\n" +
                        "\n" +
                        "       The Javan hawk-eagle is the national bird of Indonesia, where it is commonly referred to as Garuda, from the bird-like creatures in Hindu and Buddhist myths. The scientific name commemorates the Bartels family, who discovered it.\n" +
                        "\n" +
                        "       Because of the plumage variability of Spizaetus eagles, the Javan hawk-eagle was not recognised as a full species until 1953.\n" +
                        "\n" +
                        "       It is one of the rarest raptors. Due to ongoing habitat loss, small population size, limited range and hunting in some areas, it is evaluated as Endangered on the IUCN Red List of Threatened Species.It is listed on Appendix II of CITES.\n" +
                        "\n" +
                        "       In February 2012, there were only around 325 pairs of Javan hawk-eagles living in the wild, mainly in Malangbong, West Java and some in East Java. In Central Java, Mount Merapi has been deforested by eruptions and Dieng Plateau has been deforested by agriculture. The adaptation of the bird is very difficult due to their preference for Rasamala trees and Javanese rats for their diet. Ideally the population should be 1,450 pairs and without conservation the eagle is predicted to go extinct by 2025. \n",
                "Nisaetus bartelsi",
                "Animalia",
                "Chordata",
                "Aves",
                "Accipitriformes",
                "Accipitridae",
                "Nisaetus",
                "N. bartelsi"
        ));

        list.add(new Animals(
                R.drawable.harimau_sumatera,
                "Sumatran Tiger",
                "2.0 - 2.1",
                "https://proxy.duckduckgo.com/iu/?u=https%3A%2F%2Fimages.pexels.com%2Fphotos%2F533055%2Fpexels-photo-533055.jpeg%3Fcs%3Dsrgb%26dl%3Dnature-animal-grass-533055.jpg%26fm%3Djpg&f=1&nofb=1",
                "       The Sumatran tiger is a Panthera tigris sondaica population in the Indonesian island of Sumatra.This population was listed as Critically Endangered on the IUCN Red List in 2008, as it was estimated at 441 to 679 individuals, with no subpopulation larger than 50 individuals and a declining trend.\n" +
                        "\n" +
                        "       The Sumatran tiger is the only surviving tiger population in the Sunda Islands, where the Bali and Javan tigers are extinct.Sequences from complete mitochondrial genes of 34 tigers support the hypothesis that Sumatran tigers are diagnostically distinct from mainland subspecies.\n" +
                        "\n" +
                        "       In 2017, the Cat Classification Task Force of the Cat Specialist Group revised felid taxonomy and recognizes the living and extinct tiger populations in Indonesia as P. t. sondaica. \n",
                "Panthera tigris sondaica",
                "Animalia",
                "Chordata",
                "Mammalia",
                "Carnivora",
                "Felidae",
                "Panthera",
                "P. tigris"
        ));

        list.add(new Animals(
                R.drawable.ikan_belida,
                "Giant Featherback",
                "2.2 - 2.2.3",
                "https://proxy.duckduckgo.com/iu/?u=http%3A%2F%2F2.bp.blogspot.com%2F-0p7gr5DOCAQ%2FUcAa6usa3aI%2FAAAAAAAAARs%2FMUmSZu5Lglw%2Fs1600%2FChitala%2Blopis.jpg&f=1&nofb=1",
                "       The giant featherback (Chitala lopis) also known as Indonesian Featherback is a freshwater fish found in Southeast Asia, including Indochina, Malay Peninsula, Borneo, Sumatra and Java in Indonesia. It inhabits lowland river mainstreams and tributaries with rocky and sunken wood bottoms, as well as forest-covered streams. It feeds on smaller fishes, insects and vertebrates, mostly at night. \n",
                "Chitala lopis",
                "Animalia",
                "Chordata",
                "Actinopterygii",
                "Osteoglossiformes",
                "Notopteridae",
                "Chitala",
                "C. lopis"
        ));

        list.add(new Animals(
                R.drawable.komodo,
                "Komodo Dragon",
                "2.3 - 2.3.7",
                "https://proxy.duckduckgo.com/iu/?u=http%3A%2F%2F1.bp.blogspot.com%2F-I6lXbTiLWpQ%2FTr5w489IqmI%2FAAAAAAAAAkM%2FOrJaumdcCis%2Fs1600%2F%252528Indonesia%252529%2B%2525E2%252580%252593%2BKomodo%2Bisland%2B%2525E2%252580%252593%2BWalking%2Bwith%2BDragons%2B5.jpg&f=1&nofb=1",
                "       The Komodo dragon (Varanus komodoensis), also known as the Komodo monitor, is a species of lizard found in the Indonesian islands of Komodo, Rinca, Flores, and Gili Motang.A member of the monitor lizard family Varanidae, it is the largest living species of lizard, growing to a maximum length of 3 metres (10 ft) in rare cases and weighing up to approximately 70 kilograms (150 lb).\n" +
                        "\n" +
                        "       Its unusually large size has been attributed to island gigantism, since no other carnivorous animals fill the niche on the islands where it lives.However, recent research suggests the large size of Komodo dragons may be better understood as representative of a relict population of very large varanid lizards that once lived across Indonesia and Australia, most of which, along with other megafauna, died out after the Pleistocene (as a result of human activity).Fossils very similar to V. komodoensis have been found in Australia dating to more than 3.8 million years ago, and its body size remained stable on Flores, one of the small number of Indonesian islands where it is currently found, over the last 900,000 years, \"a time marked by major faunal turnovers, extinction of the island's megafauna, and the arrival of early hominids by 880 ka [kiloannums].\n" +
                        "\n" +
                        "       As a result of their size, these lizards dominate the ecosystems in which they live.Komodo dragons hunt and ambush prey including invertebrates, birds, and mammals. It has been claimed that they have a venomous bite; there are two glands in the lower jaw which secrete several toxic proteins. The biological significance of these proteins is disputed, but the glands have been shown to secrete an anticoagulant. Komodo dragons' group behaviour in hunting is exceptional in the reptile world. The diet of big Komodo dragons mainly consists of Timor deer, though they also eat considerable amounts of carrion.Komodo dragons also occasionally attack humans.\n" +
                        "\n" +
                        "       Mating begins between May and August, and the eggs are laid in September. About 20 eggs are deposited in an abandoned megapode nest or in a self-dug nesting hole.The eggs are incubated for seven to eight months, hatching in April, when insects are most plentiful. Young Komodo dragons are vulnerable and therefore dwell in trees, safe from predators and cannibalistic adults. They take 8 to 9 years to mature, and are estimated to live up to 30 years.\n" +
                        "\n" +
                        "       Komodo dragons were first recorded by Western scientists in 1910.Their large size and fearsome reputation make them popular zoo exhibits. In the wild, their range has contracted due to human activities, and they are listed as vulnerable by the IUCN.They are protected under Indonesian law, and a national park, Komodo National Park, was founded to aid protection efforts.\n",
                "Varanus komodoensis",
                "Animalia",
                "Chordata",
                "Reptilia",
                "Squamata",
                "Varanidae",
                "Varanus",
                "V. komodoensis"
        ));

        list.add(new Animals(
                R.drawable.musang_congkok,
                "Banded linsang",
                "3.0 - 3.2.6",
                "https://proxy.duckduckgo.com/iu/?u=https%3A%2F%2F4.bp.blogspot.com%2F-Iw6iQ3n542U%2FVxXh4GhchsI%2FAAAAAAAAASs%2FqYwxfDAVnR0rzVDvSLKcBoM3lLbpDaqnACLcB%2Fs400%2F313477_20151015113037.jpg&f=1&nofb=1",
                "       The banded linsang (Prionodon linsang) is a linsang, a tree-dwelling carnivorous mammal native to the Sundaic region of Southeast Asia.\n" +
                        "\n" +
                        "       The banded linsang grows to 35–41.1 centimetres (13.8–16.2 in), with a long tail that can reach 36.2 centimetres (14.3 in).It is a pale yellow with five dark bands. It has broad stripes on its neck and its tail consists of several dark bands with a dark tip. The banded linsang has very sharp retractable claws and razor sharp teeth.\n" +
                        "\n" +
                        "       The banded linsang has been recorded in southern Myanmar, Thailand, Peninsular Malaysia, and the Sunda Islands of Borneo, Sumatra, Java, Bangka and Belitung Islands. It lives in evergreen forests. In Thailand and Malaysia it has been recorded in deciduous forest, and in Sarawak also in secondary forest and close to oil palm plantations.\n",
                "Prionodon linsang",
                "Animalia",
                "Chordata",
                "Mammalia",
                "Carnivora",
                "Prionodontidae",
                "Prionodon",
                "P. linsang"
        ));

        list.add(new Animals(
                R.drawable.rusa_bawean,
                "Bawean Deer",
                "4.0 - 4.0.4",
                "https://proxy.duckduckgo.com/iu/?u=http%3A%2F%2F1.bp.blogspot.com%2F-QyoDzHnbnoQ%2FTpLRYR8srCI%2FAAAAAAAAAUY%2FxzMXUGrODTo%2Fs1600%2FPenangkaran%2BAxis%2BKuhli.JPG&f=1&nofb=1",
                "       The Bawean deer (Axis kuhlii), also known as Kuhl's hog deer or Bawean hog deer, is a highly threatened species of deer found only in the island of Bawean (Gresik Regency) in Indonesia.\n" +
                        "\n" +
                        "       A typical height for males of 60–70 cm has been reported. Males have three-tined antlers.\n" +
                        "\n" +
                        "       Their fawns are spotted at birth, which separates them from the best known western population of the hog deer (H. porcinus).\n" +
                        "\n" +
                        "       Due to ongoing habitat loss, small population size and limited range, the Bawean deer is evaluated as critically endangered on the IUCN Red List of Threatened Species. It is listed on Appendix I of CITES. It has few natural enemies except for birds of prey and large snakes such as pythons.\n",
                "Hyelapus kuhlii",
                "Animalia",
                "Chordata",
                "Mammalia",
                "Artiodactyla",
                "Cervidae",
                "Hyelapus",
                "H. kuhlii"
        ));

        list.add(new Animals(
                R.drawable.urang_utan,
                "Orangutan",
                "4.1 - 4.3.1",
                "https://proxy.duckduckgo.com/iu/?u=https%3A%2F%2Fwww.orangutantrekkingtours.com%2Fwp-content%2Fuploads%2F2017%2F07%2FEV0G1576.jpg&f=1&nofb=1",
                "       The orangutan are three extant species of great apes native to Indonesia and Malaysia. Orangutans are currently only found in the rainforests of Borneo and Sumatra. Classified in the genus Pongo, orangutans were originally considered to be one species. From 1996, they were divided into two species: the Bornean orangutan (P. pygmaeus, with three subspecies) and the Sumatran orangutan (P. abelii). In November 2017 it was reported that a third species had been identified, the Tapanuli orangutan (P. tapanuliensis).\n" +
                        "\n" +
                        "       Genomic comparisons show that the Tapanuli orangutan separated from the Sumatran orangutan about 3.4 million years ago. The Tapanuli orangutan separated from the Bornean orangutan much later, about 670,000 years ago. The orangutans are the only surviving species of the subfamily Ponginae, which also included several other species, such as the three extinct species of the genus Gigantopithecus, including the largest known primate, Gigantopithecus blacki. The ancestors of the Ponginae split from the main ape line in Africa 16 to 19 million years ago (Mya) and spread into Asia.\n" +
                        "\n" +
                        "       Orangutans are the most arboreal of the great apes and spend most of their time in trees. Their hair is reddish-brown, instead of the brown or black hair typical of chimpanzees and gorillas. Males and females differ in size and appearance. Dominant adult males have distinctive cheek pads and produce long calls that attract females and intimidate rivals. Younger males do not have these characteristics and resemble adult females. Orangutans are the most solitary of the great apes, with social bonds occurring primarily between mothers and their dependent offspring, who stay together for the first two years. Fruit is the most important component of an orangutan's diet; however, the apes will also eat vegetation, bark, honey, insects and even bird eggs. They can live over 30 years in both the wild and captivity.\n" +
                        "\n" +
                        "       Orangutans are among the most intelligent primates; they use a variety of sophisticated tools and construct elaborate sleeping nests each night from branches and foliage. The apes have been extensively studied for their learning abilities. There may even be distinctive cultures within populations. Field studies of the apes were pioneered by primatologist Birutė Galdikas. All three orangutan species are considered to be critically endangered. Human activities have caused severe declines in populations and ranges. Threats to wild orangutan populations include poaching, habitat destruction as a result of palm oil cultivation, and the illegal pet trade. Several conservation and rehabilitation organisations are dedicated to the survival of orangutans in the wild.\n",
                "Pongo pygemus",
                "Animalia",
                "Chordata",
                "Mammalia",
                "Primates",
                "Hominidae",
                "Pongo",
                "P. pygemus"
        ));


    }
}
