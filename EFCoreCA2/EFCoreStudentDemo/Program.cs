// Entity Framework Core

using Microsoft.EntityFrameworkCore;                   
using System;
using System.Linq;

// NuGet Package Manager Console:
// Install-Package Microsoft.EntityFrameworkCore.SqlServer
// Install-Package Microsoft.EntityFrameworkCore.Tools                  - migrations
// Add-Migration InitialCreate
// Update-Database                                                      - to create initial database with specified name

// migrate/update ..

namespace EFCoreCA2
{
    // a Student entity
    public class Team                                // POCO
    {
        public int ID { get; set; }                     // PK and identity
        public string Name { get; set; }  
        public string Code { get; set; }
    }
    public class Match                                // POCO
    {
        public int ID { get; set; }                     // PK and identity
        public Team Home { get; set; }                // null
        public Team Away { get; set; }
        public int HomeScore { get; set; }
        public int AwayScore { get; set; }
    }
    // Students table with column names corresponding to property names

    // context of connection to database 
    public class FootballContext : DbContext       // System.Data.Entity.DbContext        
    {
        public DbSet<Team> Teams { get; set; }
        public DbSet<Match> Matches { get; set; }

        // localDB connection string
        // c:\users\gary\StudentDB1.mdf
        protected override void OnConfiguring(DbContextOptionsBuilder optionsBuilder)
        {
            optionsBuilder.UseSqlServer(@"Server=tcp:footballca2.database.windows.net,1433;Initial Catalog=FootballCa2;Persist Security Info=False;User ID=kalum;Password=Tallaght1;MultipleActiveResultSets=False;Encrypt=True;TrustServerCertificate=False;Connection Timeout=30;");
        }
    }
    

    // table names are pluralised based on entity name by default in generated db

    class Program
    {
        static void Main()
        {
            using (FootballContext footballContext = new FootballContext())       // DbContext : IDisposable
            {
                
                Team t1 = new Team() { Name = "Cork City", Code = "CRK"};
                Team t2 = new Team() { Name = "UCD", Code = "UCD" };
                Team t3 = new Team() { Name = "Shamrock Rovers", Code = "SHA" };
                Team t4 = new Team() { Name = "Galway United", Code = "GAL" };
                Team t5 = new Team() { Name = "Bohemians", Code = "BOH" };
                Team t6 = new Team() { Name = "Derry City", Code = "DER" };
                Team t7 = new Team() { Name = "Dundalk", Code = "DUN" };
                Team t8 = new Team() { Name = "Sligo Rovers", Code = "SLI" };
                Team t9 = new Team() { Name = "St.Patrick's", Code = "STP" };
                Team t10 = new Team() { Name = "Waterford", Code = "WAT" };
                Team t11 = new Team() { Name = "Athlone Town", Code = "ATH" };
                Team t12 = new Team() { Name = "Wexford FC", Code = "WEX" };


                footballContext.Teams.Add(t1);
                footballContext.Teams.Add(t2);
                footballContext.Teams.Add(t3);
                footballContext.Teams.Add(t4);
                footballContext.Teams.Add(t5);
                footballContext.Teams.Add(t6);
                footballContext.Teams.Add(t7);
                footballContext.Teams.Add(t8);
                footballContext.Teams.Add(t9);
                footballContext.Teams.Add(t10);
                footballContext.Teams.Add(t11);
                footballContext.Teams.Add(t12);

                footballContext.SaveChanges();

                
                Match m1 = new Match() {Home = t1, Away = t2,HomeScore =1,AwayScore =2};
                Match m2 = new Match() { Home = t3, Away = t1, HomeScore = 1, AwayScore = 2 };
                Match m3 = new Match() { Home = t1, Away = t4, HomeScore = 3, AwayScore = 1 };
                Match m4 = new Match() { Home = t5, Away = t1, HomeScore = 3, AwayScore = 5 };
                Match m6 = new Match() { Home = t1, Away = t6, HomeScore = 1, AwayScore = 0 };
                Match m7 = new Match() { Home = t2, Away = t3, HomeScore = 1, AwayScore = 2 };
                Match m8 = new Match() { Home = t4, Away = t2, HomeScore = 1, AwayScore = 2 };
                Match m9 = new Match() { Home = t2, Away = t5, HomeScore = 3, AwayScore = 1 };
                Match m10 = new Match() { Home = t6, Away = t2, HomeScore = 3, AwayScore = 5 };
                Match m11 = new Match() { Home = t3, Away = t4, HomeScore = 4, AwayScore = 2 };
                Match m12 = new Match() { Home = t5, Away = t3, HomeScore = 1, AwayScore = 0 };
                Match m13 = new Match() { Home = t3, Away = t6, HomeScore = 1, AwayScore = 2 };
                Match m14 = new Match() { Home = t5, Away = t4, HomeScore = 1, AwayScore = 2 };
                Match m15 = new Match() { Home = t4, Away = t6, HomeScore = 3, AwayScore = 1 };
                Match m16 = new Match() { Home = t5, Away = t6, HomeScore = 3, AwayScore = 5 };

                Match m17 = new Match() { Home = t7, Away = t8, HomeScore = 4, AwayScore = 2 };
                Match m18 = new Match() { Home = t9, Away = t7, HomeScore = 1, AwayScore = 0 };
                Match m19 = new Match() { Home = t7, Away = t10, HomeScore = 1, AwayScore = 2 };
                Match m20 = new Match() { Home = t11, Away = t7, HomeScore = 1, AwayScore = 2 };
                Match m21 = new Match() { Home = t7, Away = t12, HomeScore = 3, AwayScore = 1 };
                Match m22 = new Match() { Home = t8, Away = t9, HomeScore = 3, AwayScore = 5 };
                Match m23 = new Match() { Home = t10, Away = t8, HomeScore = 4, AwayScore = 2 };
                Match m24 = new Match() { Home = t8, Away = t11, HomeScore = 1, AwayScore = 0 };
                Match m25 = new Match() { Home = t12, Away = t8, HomeScore = 4, AwayScore = 2 };
                Match m26 = new Match() { Home = t9, Away = t12, HomeScore = 1, AwayScore = 0 };
                Match m27 = new Match() { Home = t10, Away = t9, HomeScore = 1, AwayScore = 2 };
                Match m28 = new Match() { Home = t9, Away = t11, HomeScore = 1, AwayScore = 2 };
                Match m29 = new Match() { Home = t10, Away = t12, HomeScore = 3, AwayScore = 1 };
                Match m30 = new Match() { Home = t11, Away = t10, HomeScore = 3, AwayScore = 5 };
                Match m31 = new Match() { Home = t11, Away = t12, HomeScore = 4, AwayScore = 2 };


                footballContext.Matches.Add(m1);
                footballContext.Matches.Add(m2);
                footballContext.Matches.Add(m3);
                footballContext.Matches.Add(m4);
                footballContext.Matches.Add(m6);
                footballContext.Matches.Add(m7);
                footballContext.Matches.Add(m8);
                footballContext.Matches.Add(m9);
                footballContext.Matches.Add(m10);
                footballContext.Matches.Add(m11);
                footballContext.Matches.Add(m12);
                footballContext.Matches.Add(m13);
                footballContext.Matches.Add(m14);
                footballContext.Matches.Add(m15);
                footballContext.Matches.Add(m16);
                footballContext.Matches.Add(m17);
                footballContext.Matches.Add(m18);
                footballContext.Matches.Add(m19);
                footballContext.Matches.Add(m20);
                footballContext.Matches.Add(m21);
                footballContext.Matches.Add(m22);
                footballContext.Matches.Add(m23);
                footballContext.Matches.Add(m24);
                footballContext.Matches.Add(m25);
                footballContext.Matches.Add(m26);
                footballContext.Matches.Add(m27);
                footballContext.Matches.Add(m28);
                footballContext.Matches.Add(m29);
                footballContext.Matches.Add(m30);
                footballContext.Matches.Add(m31);
                footballContext.SaveChanges();
    
                // query students in order of ascending student number
                // LINQ to entities
                var teamsQueryInOrder = footballContext.Teams.OrderBy(team => team.ID);
                foreach (var team in teamsQueryInOrder)
                {
                    Console.WriteLine(team.ID + " " + " " + team.Name);
                }
                Console.ReadLine();
            }

            // using disposes of unmanaged resources correctly
            // is try / finally with Dispose called on resource in finally
        }
    }
}

/*
Conventions:
Primary Key - property called ID or <classname>ID, int or GUID makes it identity column also
*/

/*
create initial migration (cf migrations folder, code to create, metadata, snapshot)
update database (creates the database initially e.g. StudentDB1.mdf in c:\users\gary
*/

