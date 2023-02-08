package medicvirtual.medicvirtual;

import java.util.ArrayList;

public class ReadMedicalNews{
    ArrayList<String> news_list= new ArrayList<>();
    ArrayList<String> news_description_list= new ArrayList<>();

    public ReadMedicalNews(){
        default_news();
    }
    public ArrayList<String> get_news_list(){
        return news_list;
    }
    public ArrayList<String> get_news_description_list(){
        return news_description_list;
    }
    public void default_news(){
        //news 1
        news_list.add("Progress and controversy in Alzheimer's research: Aducanumab's FDA approval");
        news_description_list.add("According to the World Health Organization (WHO), at least 55 million people worldwide are currently living with dementia. Dementia most commonly affects those over the age of 65, and with people living longer, the WHO expects the number to reach around 140 million by 2050. Alzheimer’s disease accounts for 60-70%  of dementia cases. A characteristic of Alzheimer’s disease is the presence of beta-amyloid plaques in the brain, which researchers have hitherto thought to disrupt the transmission of nerve impulses and cause many of the symptoms of Alzheimer’s.\n" +
                "\n" +
                "However, the role of beta-amyloid in the disease is still debated.\n" +
                "\n" +
                "Medications that clear these plaques were hailed as a great breakthrough in the search for effective Alzheimer’s disease treatments, and several are in development and undergoing clinical trials.\n" +
                "\n" +
                "But are they the wonder drugs patients, relatives, and researchers are hoping for?");

        //news 2
        news_list.add("Algorithm suggests altered speech may be early sign of Parkinson’s disease");
        news_description_list.add("Parkinson’s disease (PD) is the second most common neurodegenerative disease after Alzheimer’s disease. Over 10 million people around the world receive a diagnosis each year.\n" +
                "\n" +
                "The underlying mechanisms of Parkinson’s are not yet fully understood. PD is preceded by non-specific symptoms lasting decades, including constipation, apathy, and daytime sleepiness. Motor symptoms, including tremors, freezing, and dizziness, appear late in the course of neurodegeneration.\n" +
                "\n" +
                "Currently, PD diagnoses happen late in the neurodegenerative process. Earlier identification of symptoms could allow for earlier intervention and thus longer uncompromised working capacity and prolonged quality of life.\n" +
                "\n" +
                "Speech acoustic analysis in PD has received growing scientific interest in recent years as a potential diagnostic biomarker. Studies have shown that subjects with early PD have various kinds of speech deficits.\n" +
                "\n" +
                "Further understanding how PD affects the voice could lead to the development of screening methods that can distinguish between the voices of PD patients and healthy individuals.\n" +
                "\n" +
                "Recently, researchers developed an automated screening method that can distinguish between the voices of PD patients and healthy individuals.\n" +
                "\n" +
                "The researchers found their model could predict 80-90% of voices from those with PD.\n" +
                "\n" +
                "“The goal of making a Parkinson’s diagnosis easy is admirable,” Dr. Clifford Segil, a neurologist at Providence Saint John’s Health Center in Santa Monica, California, who was not involved in the study, told Medical News Today.\n" +
                "\n" +
                "“There are not enough general neurologists or movement disorder neurologists in the world at this time. I agree with the authors that this study is not meant to be a substitute for a detailed neurological exam from a neurologist,” he added.");

        //news 3
        news_list.add("How does the human brain create consciousness, and why?");
        news_description_list.add("Scientists and philosophers have long struggled to explain how the brain generates conscious experiences. Some doubt whether the objective tools of science can ever get to grips with a phenomenon that is so subjective. Even so, researchers have begun to identify the changes in brain activity that accompany awareness, and they also have some fascinating ideas about why consciousness evolved.\n" +
                "\nHow the brain conjures conscious awareness from the electrical activity of billions of individual nerve cells remains one of the great unanswered questions of life.\n" +
                "\n" +
                "Each of us knows that we are conscious, in terms of having thoughts, perceptions, and feelings, but we are unable to prove it to anyone else. Only we have access to the mysterious essence that allows us to experience those thoughts, perceptions, and feelings.\n" +
                "\n" +
                "In the 1990s, the philosopher David Chalmers described this inaccessibility to external, objective scrutiny as the “hard problem” of consciousness.\n" +
                "\n" +
                "He proposed that an easier task for scientists to tackle would be its “neural correlates” — where and how brain activity changes when people have conscious experiences.\n" +
                "\n" +
                "Apart from curiosity, scientists are most likely motivated to discover the neural correlates of consciousness in order to help diagnose and treat disorders of consciousness, such as persistent vegetative states and some psychiatric disorders.\n");


        //news 4
        news_list.add("Poor sleep during teen years may raise risk of multiple sclerosis (MS)");
        news_description_list.add("Sleep is essential to health, helping the body maintain its typical functions. But researchers are still working to understand the health benefits of sleep and the dangers of poor sleep. One area of interest is the importance of sleep during adolescence.\n" +
                "\n" +
                "A recent study published in the Journal of Neurology, Neurosurgery & Psychiatry found that poor sleep in adolescence may increase the risk of developing multiple sclerosis (MS).Multiple sclerosisTrusted Source is an autoimmune disorder with damage to the central nervous system. Generally, the symptom onset occurs between the ages of 20 to 40.\n" +
                "\n" +
                "People with multiple sclerosis can experience a wide range of symptomsTrusted Source\n" +
                "Trusted Source\n" +
                "\n" +
                "National Institute of Neurological Disorders and Stroke\n" +
                " Governmental authority\n" +
                "Go to source\n" +
                "\n" +
                ". The condition can cause someone to experience increased disability over time. People with multiple sclerosis may have muscle weakness, problems with vision, dizziness, and numbness.\n" +
                "\n" +
                "It is unclear why certain people develop multiple sclerosis. It could be related to a response by the body’s immune system. People with a family member with multiple sclerosis may have increased susceptibility to developing the disorder.\n" +"Researchers are still working to understand the level of risk posed by modifiable factors and how people can reduce their risk of developing multiple sclerosis.\n" +"T\u200Bhis particular study was a case-control study in Sweden. Researchers included 2,075 participants who had multiple sclerosis and 3,164 controls. Researchers asked participants about sleep quality and duration during their teenage years. They divided sleep duration into three categories:\n" +
                "\n" +
                "less than seven hours each night (short sleep)\n" +
                "between seven and nine hours each night\n" +
                "10 or more hours each night (long sleep)\n" +
                "Researchers further asked participants about the difference between when they slept on workdays or schooldays and when they slept on weekends and free days. Finally, researchers asked participants about sleep quality, ranging from very bad to very good.\n" +
                "\n" +
                "The study found that sleeping less than seven hours at night during adolescence was associated with an increased risk of developing multiple sclerosis. Low sleep quality offered a similar associated risk. They found that the sleep timing differences between weekends and schooldays did not significantly impact a person’s risk for multiple sclerosis.");
    }
}