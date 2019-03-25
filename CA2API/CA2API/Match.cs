using System;

namespace HelloWorldWebAPI.Models
{
    // a simple greeting
    public class Match
    {
        public int ID { get; set; }
        public Team Home { get; set; }
        public Team Away { get; set; }
        //public int HomeScore { get; set; }
        //public int AwayScore { get; set; }
    }
}
